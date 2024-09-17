package oops.properties.examples.a2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFileFromComputer {

	public static void main(String[] args) throws Exception {
		String filePath = "D:" + File.separator + "test" + File.separator + "app.properties";

		String name = readProperty(filePath, "name");
		System.out.println(name);

		String newName = changeProperty(filePath, "name", "tanush");
		System.out.println(newName);

	}

	public static String readProperty(String filePath, String key) throws Exception {
		String value = null;
		FileInputStream fis = null;
		Properties property = new Properties();
		try {
			fis = new FileInputStream(filePath);
			property.load(fis);
			value = property.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		return value;
	}

	public static String changeProperty(String filePath, String key, String value) throws Exception {
		String newValue = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Properties property = new Properties();
		try {
			fis = new FileInputStream(filePath);
			property.load(fis);
			fos = new FileOutputStream(filePath);
			property.store(fos, value);
			newValue = property.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		return newValue;
	}

}