package oops.files.examples.a1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Target;

public class CopyFile {
	public static void main(String[] args) throws Exception {

		String sourceFilePath = "D:\\test\\java.jpeg";
		String tragetFilePath = "D:\\test\\java-new.jpeg";
		copyFile(sourceFilePath, tragetFilePath);
	}

	public static void copyFile(String sourceFilePath, String targetFilePath) throws Exception {
		// logic to copy file
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(sourceFilePath);
			fos = new FileOutputStream(targetFilePath);

			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("READ_FILE_FROM: " + sourceFilePath);
			System.out.println("WROTE_FILE_TO: " + targetFilePath);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}

	}
}
