package twelvthAssignment;

//7. Write a Java program to count no. Of words into file

import java.io.*;

public class CountNumberOfWords {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		BufferedReader br = new BufferedReader(new FileReader(filePath+"myFile.txt"));
		String line;
		int words=0;
		while((line=br.readLine())!=null) {
			String arr[] = line.split("\\s+");
			words+=arr.length;
		}
		System.out.println("Number of words in the file: "+words);
		br.close();
		
	}

}
