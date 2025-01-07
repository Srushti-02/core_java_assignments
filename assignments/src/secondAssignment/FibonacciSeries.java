package secondAssignment;
import java.util.Scanner;

//6. Generate the Fib… series 1 1 2 3 5 8 13


public class FibonacciSeries {
	static int fib(int num) {
		if(num <= 1) {
			return 1;
		}
		return fib(num-1)+fib(num-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num  = sc.nextInt();
		sc.close();
		System.out.println("Fibonacci Series : ");
		for(int i = 0; i < num; i++) {
			System.out.print(fib(i)+" ");
		}
	}

}
