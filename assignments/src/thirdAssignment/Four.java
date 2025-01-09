package thirdAssignment;

class Stack{
	static int n = 5;
	static int arr[] = new int[5];
	static int i = 0;
	void push(int arr[], int num) {
		if(i == n) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[i]=num;
		i++;
		System.out.println("Element " +num+" pushed to the stack");
	}
	void pop(int arr[]) {
		if(i<0) {
			System.out.println("Stack Underflow");
			return;
		}
		--i;
		System.out.println("Element "+arr[i]+" has been popped out");
		arr[i]=0;		
	}

}
public class Four {

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(Stack.arr, 10);
		st.push(Stack.arr, 15);
		st.push(Stack.arr, 16);
		st.pop(Stack.arr);
		st.pop(Stack.arr);
	}

}
