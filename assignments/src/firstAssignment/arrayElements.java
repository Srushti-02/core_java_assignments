package firstAssignment;

//7. Accept values for 1-D array of integer type and display it on screen
public class arrayElements {

	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Array elements are: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
