//5. Write a java program to split string by “blank space” and “-” patterns

package fourthAssignment;

public class SplitString {

	public static void main(String[] args) {
		String s = "Hello-there I am Srushti";
		String arr[]=s.split("[-\\s]");
		for(String ans:arr) {
			System.out.println(ans);
		}
	}

}
