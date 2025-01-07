package firstAssignment;

//2. simple arithmeticOperations with different data types via cmd
public class arithmeticOperations2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		float b = Float.parseFloat(args[1]);
		double c = Double.parseDouble(args[2]);
		String s = args[3];
		System.out.println(s+" integer is " + a + " float is "+b+" double is "+c);
		System.out.println("Sum of a and b is " + (float)(a+b));
		System.out.println("Sum of a and c is " + (int)(a+c));
		System.out.println("Sum of b and c is " + (float)(b+c));
		System.out.println("Multiplication of a and b is " + (float)(a*b));
		System.out.println("Multiplication of a and c is " + (int)(a*c));
		System.out.println("Multiplication of b and c is " + (float)(b*c));
		System.out.println("Addition of string and any other data type leads to concatenation : " + (a+s));
	}

}
