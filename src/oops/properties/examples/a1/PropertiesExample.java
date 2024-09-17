package oops.properties.examples.a1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		// project path
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

//		String configFilePath = projectPath +
//
//				"\\src\\oops\\properties\\examples\\a1\\config.properties";

		String configFilePath = projectPath

				+ File.separator + "src"

				+ File.separator + "oops"

				+ File.separator + "properties"

				+ File.separator + "examples"

				+ File.separator + "a1"

				+ File.separator + "config.properties";

		System.out.println(configFilePath);

		FileInputStream fis = null;
		Properties property = new Properties();

		try {
			fis = new FileInputStream(configFilePath);

			property.load(fis);

			String name = property.getProperty("name");
			System.out.println(name);

			String city = property.getProperty("city");
			System.out.println(city);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}

	}

}
