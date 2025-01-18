package eighthAssignment;
import java.util.Scanner;

class Number{
	int a, b;
	
	double add() {
		return a+b;
	}
	double sub() {
		return a-b;
	}
	double mul() {
		return a*b;
	}
	double div() {
		return a/b;
	}
	
	Number(int a, int b){
		this.a = a;
		this.b = b;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		if(a<=0 || b<=0) {
			throw new IllegalArgumentException();
		}
		Number num = new Number(a, b);
		System.out.println("Addition = "+num.add()+"\nSubtraction = "+num.sub()+"\nMultiplication = "+num.mul()+"\nDivision = "+num.div());
	}

}
