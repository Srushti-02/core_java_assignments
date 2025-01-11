//9. Accept Integer values from user and display it’s equivalent Binary, Hexadecimal,
//Octal values.

package fourthAssignment;
import java.util.Scanner;
public class BinaryHexaOctalDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a = sc.nextInt();
		sc.close();
		System.out.println("Binary = "+ Integer.toBinaryString(a));
		System.out.println("HexaDecimal = "+Integer.toHexString(a));
		System.out.println("Octal = "+Integer.toOctalString(a));
	}

}
