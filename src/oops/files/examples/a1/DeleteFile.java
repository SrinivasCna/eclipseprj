package oops.files.examples.a1;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		String filePath = "D:\\test\\java.txt";
		File file;

		try {
			file = new File(filePath);

			if (file.exists()) {
				file.delete();

				System.out.println("FILE_DELETED_AT: " + filePath);
			} else {
				System.out.println("FILE_NOT_FOUND_AT: " + filePath);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
