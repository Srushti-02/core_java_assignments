package secondAssignment;
import java.util.Scanner;

//5. WAP to reverse the given number
public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		int newNum = 0;
		while(num > 0) {
			int rem = num%10;
			newNum = newNum*10+rem;
			num/=10;
		}
		System.out.println("Reversed number is "+newNum);
	}

}
