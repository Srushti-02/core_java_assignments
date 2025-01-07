package secondAssignment;
import java.util.Scanner;
//2. WAP to check whether a given year is a LEAP year
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		sc.close();
		if(year%4 == 0) {
			System.out.println("This is a Leap year");
		} else {
			System.out.println("This is not a leap year");
		}
	}

}
