package secondAssignment;
import java.util.Scanner;


//3. WAP to find the factorial of a number
public class Factorial {
	static long factorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Factorial is : " + factorial(num));
		
	}

}
