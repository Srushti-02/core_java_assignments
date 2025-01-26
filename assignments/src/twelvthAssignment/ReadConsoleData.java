package twelvthAssignment;

//6. Write a java program to read console data using BufferedReader API

import java.io.*;
import java.util.Scanner;

public class ReadConsoleData {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the console input");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		br.close();
	}

}
