package thirdAssignment;
import java.util.Scanner;
//Declare three array of integer types ,Accept values for two array.Perform
//arithmetic operation on both array values and store corresponding values in third
//array. e.g: c[0]=a[0]+b[0]
class Operations{
	int n;
	int A[] = new int[n];
	int B[] = new int[n];
	int C[] = new int[n];
	void add(int n, int A[], int B[]) {
		for(int i = 0; i < n; i++) {
			C[i] = A[i]+B[i];
		}
	}
	void sub(int n, int A[], int B[]) {
		for(int i = 0; i < n; i++) {
			C[i] = A[i]-B[i];
		}
	}
	void mul(int n, int A[], int B[]) {
		for(int i = 0; i < n; i++) {
			C[i] = A[i]*B[i];
		}
	}
	void div(int n, int A[], int B[]) {
		for(int i = 0; i < n; i++) {
			C[i] = A[i]/B[i];
		}
	}
	
	void printArray() {
		for(int i = 0; i < n; i++) {
			System.out.print(C[i]+" ");
		}
		System.out.println();
	}
	Operations(int n, int A[], int B[], int C[]){
		this.n = n;
		this.A = A.clone();
		this.B = B.clone();
		this.C = C.clone();
	}
}

public class Three {

	public static void main(String[] args) {
		int n = 5;
		int A[] = {1, 2, 3, 4, 5};
		int B[] = {1, 2, 3, 4, 5};
		int C[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		sc.close();
		Operations op = new Operations(n, A, B, C);
		switch(choice) {
		case 1:
			op.add(n, A, B);
			op.printArray();
			break;
		case 2:
			op.sub(n, A, B);
			op.printArray();
			break;
		case 3:
			op.mul(n, A, B);
			op.printArray();
			break;
		case 4:
			op.div(n, A, B);
			op.printArray();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

}
