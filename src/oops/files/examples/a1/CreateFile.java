package oops.files.examples.a1;

import java.io.File;

// file.exists()

public class CreateFile {

	public static void main(String[] args) {
		String filePath = "D:\\test\\java.txt";
		File file;

		try {
			file = new File(filePath);
			
			//if file.exists() if block => System.out.println("FILE_ALREADY_EXISTS_AT: "+ filePath);
			//if file.exists() else if block => file.createNewFile(); System.out.println("FILECREATED_AT: "+ filePath);
			// if file.exists() else block => System.out.println("FILE_NOT_CREATED_AT: "+filePath);
			
			if (file.exists() ) { 
				System.out.println("FILE_ALREADY_EXISTS_AT: "+ filePath);
			}else if ( file.createNewFile()) {
				System.out.println("FILE_CREATED_AT: "+ filePath);
			}else {
				System.out.println("FILE_NOT_CREATED_AT: "+filePath);
			}
			
			
			
			file.createNewFile();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
