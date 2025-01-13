package seventhAssignment;
import java.util.Scanner;

interface MyMath{
	double sqr(double a);
	double cube(double a);
	double cosine(double a);
	double sine(double a);
}

class implMath implements MyMath{
	@Override
	public double sqr(double a) {
		return a*a;
	}

	@Override
	public double cube(double a) {
		return a*a*a;
	}

	@Override
	public double cosine(double a) {
		return Math.cos(a);
	}

	@Override
	public double sine(double a) {
		return Math.sin(a);
	}

}
public class Demo2 {

	public static void main(String[] args) {
		MyMath obj = new implMath();
		System.out.print("Enter double a : ");
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		sc.close();
		System.out.println("Square "+ obj.sqr(a));
		System.out.println("Cube "+ obj.cube(a));
		System.out.println("Cosine "+ obj.cosine(a));
		System.out.println("Sine "+ obj.sine(a));
	}

}
