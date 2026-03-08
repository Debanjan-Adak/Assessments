package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {

//		File f = new File("C:\\Users\\adakd\\OneDrive\\Documents\\Capgemini\\test2.txt");
////		f.createNewFile();
//		System.out.println(f.createNewFile());
//		
////		System.out.println(f.delete());
//
//		if (f.exists()) {
//			System.out.println("Doing Operations on the files");
//		} else
//			System.out.println("Not Present");
//		FileInputStream fis = new FileInputStream(f);
////		System.out.println(fis.rea);
//		
//		int count;
//		while((count=fis.read())!=-1)
//		{
//			System.out.print((char)count);
//		}
//		Scanner sc= new Scanner(new File("C:\\Users\\adakd\\OneDrive\\Documents\\Capgemini\\test2.txt"));
//		while(sc.hasNext())
//		System.out.println(sc.next());
//		BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\adakd\\OneDrive\\Documents\\Capgemini\\test2.txt"));
//		System.out.println(b1.readAllLines());
//		System.out.println(b1.);
//		
		
		FileWriter fw = new FileWriter("C:\\Users\\adakd\\OneDrive\\Documents\\Capgemini\\test2.txt");
		fw.write("My name is debuszz /n hello");
		BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\adakd\\OneDrive\\Documents\\Capgemini\\test2.txt"));
		System.out.println(b1.readLine());
		b1.close();
		
	}
}












 
