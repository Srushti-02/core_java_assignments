package twelvthAssignment;

//5. Write a java program that takes a file name and a search string from the user, if
//the search string occures in the file, then it counts the no. Of occurences of the
//string
//Ex: output :Enter a file name : test.txt
//Enter a word : you


import java.io.*;
import java.util.Scanner;

public class StringOccurenceInFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		System.out.print("Enter File Name: ");
		String file = sc.nextLine();
		System.out.print("Enter String to find: ");
		String s = sc.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(filePath+file));
		String line;
		int count=0;
		while((line=br.readLine())!=null) {
			String[] arr = line.split("\\s+");
			for(String match:arr) {
				if(match.equals(s)) {
					count++;
				}
			}
		}
		System.out.println("Occurence of the string "+s+" is "+count);
		sc.close();
		br.close();
	}

}
