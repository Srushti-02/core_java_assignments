package twelvthAssignment;
import java.io.*;

//2. Write a java program to read & write the content to and from “myFile.txt” using
//FileInputStream and FileOutputStream API

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		FileInputStream fin = new FileInputStream(filePath+"myFile.txt");
		int ch=0;
		while((ch=fin.read())!=-1) {
			System.out.print((char)ch);
		}
		fin.close();
		FileOutputStream fout = new FileOutputStream(filePath+"myFile.txt");
		String s = "I am from Satara";
		char[] b = s.toCharArray();
		for(int i = 0; i < b.length; i++) {
			fout.write(b[i]);
		}
		fout.close();
	}

}
