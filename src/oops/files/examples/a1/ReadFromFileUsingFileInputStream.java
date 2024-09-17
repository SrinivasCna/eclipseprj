package oops.files.examples.a1;

import java.io.FileInputStream;

// FileInputStream class
// read()
// read and returns a byte at a time
// it reaches end of file, it returns -1

public class ReadFromFileUsingFileInputStream {
	public static void main(String[] args) throws Exception {
		String filePath = "D:\\test\\java.txt";

		String text = readFile(filePath);
		System.out.println(text);
	}

	public static String readFile(String filePath) throws Exception {
		FileInputStream fis = null;
		String text = "";

		try {
			fis = new FileInputStream(filePath);
			int data;

			while ((data = fis.read()) != -1) {
				text = text + (char) data;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}

		return text;

	}

}
