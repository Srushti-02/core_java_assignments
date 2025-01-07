package firstAssignment;

//5. Accept three digit number and calculate the sum of digit
public class digitSum {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Number is " + num);
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num/=10;
			sum+=rem;
		}
		System.out.println("Sum of the digits is "+sum);
		
	}

}
 