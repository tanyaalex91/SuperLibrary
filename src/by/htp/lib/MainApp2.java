package by.htp.lib;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class MainApp2 {

	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {
//		InputStream is = new FileInputStream (FILE_PATH);
//		BufferedInputStream bis = new BufferedInputStream(is);
	
	
		try(BufferedInputStream bis = new BufferedInputStream (new FileInputStream (FILE_PATH))) {
			int count = 0;
			byte[] bytes = new byte [1024];
			do {
				count = bis.read(bytes);
				//System.out.print(count);
			}
			while (count>0);
			System.out.println(new String (bytes));
			}
		
	
		catch (IOException e) {
			e.printStackTrace();
		
			
//		
//	}System.out.println("________");
//	
//	try (Reader reader  = new FileReader(FILE_PATH)) {
//		int count = 0;
//		char[] chars = new char [1024];
//		do {
////			count = reader.read();
////			System.out.print(count);
//			count = reader.read(chars);
//		}
//	while (count>0);
//		System.out.println(new String (chars));
//	}
//	catch (IOException e) {
//		e.printStackTrace();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
}