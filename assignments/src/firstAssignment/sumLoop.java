package firstAssignment;

//4. Accept five different values by using for loop and display sum of that values
public class sumLoop {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Sum of the elements is "+sum);
	}

}
