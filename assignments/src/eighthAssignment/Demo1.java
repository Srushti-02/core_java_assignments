package eighthAssignment;


//1. Write a class TestException to test different types of exceptions, such as
//NumberFormateException,ArrayIndexOutOfBoundsException,ArithMeticException,N
//ullPointerException,ClassNotFoundException etc

public class Demo1 {

	public static void main(String[] args) {
		try {
//			//Number format exception
//			int a = Integer.parseInt(args[0]);
//			System.out.println("a = "+a);
			
//			//Array index out of bounds
//			double a = Double.parseDouble(args[1]);
//			System.out.println("a = "+a);
			
//			//Arithmetic Exception
//			int c = 10/0;
//			System.out.println("c = "+c);
			
			//Null Pointer Exception
			String s=null;
			System.out.println(s.length());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Number format exception");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Array Index out of Bounds");
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception");
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("Null Pointer Exception");
		}
	}

}
