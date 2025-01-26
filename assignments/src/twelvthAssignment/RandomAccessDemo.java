package twelvthAssignment;

import java.io.*;

//8. Write a java program to read & write the content to and from “myFile.txt” using
//RandomAccessFile

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		RandomAccessFile r = new RandomAccessFile(filePath+"myFile.txt", "rw");
		RandomAccessFile r1 = new RandomAccessFile(filePath+"secondFile.txt", "r");
		int ch;
		while((ch=r.read())!=-1) {
			System.out.print((char)ch);
		}
		r.seek(r.length());
		r.writeBytes(r1.readLine());
		r.close();
		r1.close();
	}

}
