//3. Use the String Class Methods like length, hashCode,equals, replace, trim,
//subString, concatinate , compare , charAt, subString etc.. for a given String(s)

package fourthAssignment;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string1 to do operations: ");
		String s = sc.next();
		System.out.print("Enter the string2 to do operations: ");
		String s1 = sc.next();
		sc.close();
		
		System.out.println("Length of the string : "+s.length());
		System.out.println("hashCode of the string : "+s.hashCode());
		System.out.println("Does string equal? : "+s.equals(s1));
		System.out.println("Replaced string : "+s.replace('s', 'p'));
		System.out.println("Trimmed string : "+s.trim());
		System.out.println("Substring of string "+s.substring(0, 4));
		System.out.println("Concatenated string: "+s.concat(s1));
		System.out.println("Comparision of strings: "+s.compareTo(s1));
		System.out.println("CharAt 4 in string : "+s.charAt(4));
	}

}
