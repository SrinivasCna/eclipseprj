package oops.files.examples.a1;

import java.io.FileWriter;

//  we can use FileWriter class to create a object of FileWriter class
// and use writer() method
public class WriteToFile {

	public static void main(String[] args) throws Exception {
		// String text = "Hello World\nHello People";
		// OR
		String text = """
				Hello World
				Sun Shine
				"""; // String block representation
		System.out.println(text);
		String filePath = "D:\\test\\java.txt";
//		File file;
//		FileWriter fileWriter = null;
//
//		try {
//			file = new File(filePath);
//			fileWriter = new FileWriter(file);
//
//			if (file.exists()) {
//				fileWriter.write(text);
//				System.out.println("SUCCESS WROTE_TO_FILE AT: " + filePath);
//			} else {
//				System.out.println("FILE_NOT_FOUND_AT: " + filePath);
//			}

		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter(filePath);

			fileWriter.write(text);
			System.out.println("SUCCESS WROTE_TO_FILE AT: " + filePath);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}

	}

}
