package seventhAssignment;

interface Relational{
	void greaterThan();
	void lessThan();
	void greaterThaneq();
	void lessThaneq();
}
class implRel implements Relational{
	
	int a, b;
	@Override
	public void greaterThan() {
		if(a > b) System.out.println("A is greater than B");
		else if(a < b) System.out.println("B is greater than A");
		else System.out.println("Don't know");
	}

	@Override
	public void lessThan() {
		if(a < b) System.out.println("A is less than B");
		else if(a > b) System.out.println("B is less than A");
		else System.out.println("Don't know");
	}

	@Override
	public void greaterThaneq() {
		if(a >= b) System.out.println("A is greater than or equal to B");
		else if(a <= b) System.out.println("B is greater than or equal to A");
	}

	@Override
	public void lessThaneq() {
		if(a <= b) System.out.println("A is less than or equal to B");
		else if(a >= b) System.out.println("B is less than or equal to A");
	}
	implRel(int a, int b){
		this.a = a;
		this.b = b;
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		implRel rel = new implRel(10, 10);
		rel.greaterThan();
		rel.lessThan();
		rel.greaterThaneq();
		rel.lessThaneq();
	}

}
