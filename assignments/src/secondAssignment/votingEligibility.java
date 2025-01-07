//1. WAP to check whether a person is eligible for voting

package secondAssignment;
import java.util.Scanner;
public class votingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		sc.close();
		if(age >= 18) {
			System.out.println("You are eligible to vote!!");
		}else {
			System.out.println("You are not eligible");
		}
		
	}

}
