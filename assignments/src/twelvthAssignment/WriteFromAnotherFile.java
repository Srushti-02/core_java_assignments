package twelvthAssignment;

import java.io.*;

//3. Java program to read content from one file and write it into another file.

public class WriteFromAnotherFile {

	public static void main(String[] args) throws IOException{
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		FileInputStream fin = new FileInputStream(filePath+"myFile.txt");
		FileOutputStream fout = new FileOutputStream(filePath+"secondFile.txt");
		int ch = 0;
		while((ch=fin.read())!=-1) {
			fout.write((char)ch);
		}
		System.out.println("Copied text from another file");
		fin.close();
		fout.close();
	}

}
