//4. Create Manager class extending Employee class with attributes as
//fixedsalary(int) and incentives(int) and method computeSalary() to calculate the
//salary of Manager .Print the salary and details of Manager


package fifthAssignment;

class Manager extends Employee{
	private int fixedSalary;
	private int incentives;
	double computeSalary() {
		double da = 0.2*fixedSalary;
		double hra = 0.3*fixedSalary;
		double gross_salary = fixedSalary+da+hra+incentives;
		return gross_salary;
	}
	Manager(){
		fixedSalary = 5000;
		incentives = 100;
	}
	Manager(int fixedSalary, int incentives){
		this.fixedSalary = fixedSalary;
		this.incentives = incentives;
	}
	@Override
	public String toString() {
		return "Manager is an " + super.toString() + "fixedSalary=" + fixedSalary + " || incentives=" + incentives + " || computeSalary()="
				+ computeSalary();
	}
	
}
public class ManagerDemo {

	public static void main(String[] args) {
		Manager mg = new Manager();
		System.out.println(mg);
	}

}
