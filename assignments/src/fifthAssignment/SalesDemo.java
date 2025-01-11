//3. Create SalesPerson class extending WageEmployee with attributes as sales(int)
//and commission (int). Overide the ComputeSalary()
//in Salesperson class and print the salary and details of SalesPerson

package fifthAssignment;

class SalesPerson extends WageEmployee{
	int sales;
	int commission;
	
	@Override
	double computeSalary() {
		double da = 0.2*super.salary;
		double hra = 0.3*super.salary;
		double gross_salary = super.salary+da+hra+sales+commission;
		return gross_salary;
	}	
	SalesPerson(){
		sales = 100;
		commission = 10;
	}
	SalesPerson(int sales, int commission){
		this.sales = sales;
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "WageEmployee [sales=" + sales + ", commission=" + commission + ", salary=" + salary + ", Gross Salary="
				+ computeSalary()+ "]";
	}
}
public class SalesDemo {

	public static void main(String[] args) {
		SalesPerson sp = new SalesPerson();
		System.out.println(sp);
	}

}
