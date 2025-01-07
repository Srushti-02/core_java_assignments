package firstAssignment;


//1. Simple Arithmetic operations with two integer values via cmd
public class arithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Value of a is "+a+" and value of b is "+b);
		System.out.println("Addition of a and b is : "+ (a+b));
		System.out.println("Subtraction of a and b is : "+ (a-b));
		System.out.println("Multiplication of a and b is : "+ (a*b));
		System.out.println("Division of a and b is : "+ (a/b));
		System.out.println("Modulus of a and b is : "+ (a%b));
		
	}

}
