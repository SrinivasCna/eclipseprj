package oops.files.examples.a1;

import java.io.FileReader;

// FileReader class
// read()
// Reads a single character
// returns character or -1 if it reaches the end of the file

public class ReadFromFile {
	public static void main(String[] args) throws Exception {
		String filePath = "D:\\test\\java.txt";

		FileReader fr = null;
		try {
			fr = new FileReader(filePath);

			int i;
			//fr.read();
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}

	}

}
