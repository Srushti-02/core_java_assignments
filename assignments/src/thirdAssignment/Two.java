package thirdAssignment;
//Write a class Addition2 with add method (overloading) using varargs and
//enhanced for loop
class Addition2{
	void add(int...a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println("Sum of the integers is : "+sum);
	}
	
	
	void add(double...a) {
		double sum=0;
		for(double i: a) {
			sum+=i;
		}
		System.out.println("Sum of the double numbers is : "+sum);
	}
}
public class Two {

	public static void main(String[] args) {
		Addition2 addnum = new Addition2();
		addnum.add(1, 2, 3, 4);
		addnum.add(1.5, 2.4, 5.78);
	}

}
