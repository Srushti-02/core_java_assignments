package eighthAssignment;
import java.util.Scanner;
//2. Create a class called CalcAverage that has the following method:(use throw
//keyword)
//public double avgFirstN(int N)
//This method receives an integer as a parameter and calculates the average of first
//N natural numbers. If N is not a natural number, throw an exception


public class Demo2 {
	public static double avgFirstN(int N) {
		double real = N;
		int sum = 0;
		if(N <= 0) {
			throw new IllegalArgumentException();
		}
		while(N>0) {
			sum+=N;
			N--;
		}
		return sum/real;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(avgFirstN(N));
	}

}
