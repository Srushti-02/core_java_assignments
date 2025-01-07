package secondAssignment;
import java.util.Scanner;

//4. WAP to find whether a given number is an Armstrong number
public class ArmstrongNumber {
	static int sizeOfNum(int num) {
		int count = 0;
		while(num > 0) {
			num/=10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		int originalNum = num;
		int size = sizeOfNum(num);
		int sum = 0;
		while(num > 0) {
			int rem = num%10;
			int mul = 1;
			for(int i = 0; i < size; i++) {
				mul*=rem;
			}
			sum+=mul;
			num/=10;
		}
		if(sum==originalNum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
