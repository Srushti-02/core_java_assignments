package firstAssignment;

//8. modify the above program and calculate the sum of number in array
public class sumArrayElements {

	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int sum = 0;
		System.out.println("Array elements are: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("Sum of the array elements is "+sum);
	}

}
