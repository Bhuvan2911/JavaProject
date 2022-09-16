package Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Io {
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException  {

	try {
		File f = new File("C:\\Users\\HP\\Documents\\Collections\\Bhuvi.txt");
		FileReader fr = new FileReader(f);
		int temp = 0;
		while ((temp = fr.read())!=-1) {
			System.out.println((char)temp);
		}
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


