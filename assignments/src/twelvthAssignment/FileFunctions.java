package twelvthAssignment;

import java.io.*;

//1. Write java program to print file specification such as isFile,isDirectory,last
//modified date,file size,file patch etc

public class FileFunctions {

	public static void main(String[] args) throws IOException {
		String fileName = "D:\\profound dbms\\SQL-Developer\\README.md\\";
		
		File f = new File(fileName);
		System.out.println("isFile: "+f.isFile());
		System.out.println("isDirectory: "+f.isDirectory());
		System.out.println("lastModified: "+f.lastModified());
		System.out.println("getParentFile: "+f.getParentFile());
		System.out.println("getCanonicalPath: "+f.getCanonicalPath());
		System.out.println("isHidden: "+f.isHidden());
		System.out.println("File size: "+f.getTotalSpace());
		System.out.println("File path: "+f.getPath());
	}
	

}
