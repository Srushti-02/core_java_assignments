//2. Create class WageEmployee extending Employee class with attributes as hrs
//(int)and rate(int) and method computeSalary() to calculate the salary.Print the
//salary and details of WageEmployee.
//(Note: Use the previous date and Employee classes. Accept the values from the
//user..Default, Parameterised Constructor and toString() to be written in all the
//classes)
package fifthAssignment;

class DOB{
	private int day;
	private int month;
	private int year;
	
	DOB(){
		day = 02;
		month = 07;
		year = 2002;
	}
	DOB(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return day + "/" + month + "/" + year ;
	}
	
}
class Employee{
	private int id;
	private String name;
	double salary;
	private DOB dob = new DOB();
	
	Employee(){
		id = 1;
		name = "Srushti";
		salary = 5000;
	}
	Employee(int id, String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee \nid=" + id + " || name=" + name + " || dob=" + dob + " || salary=" +salary;
	}
	
	
}
class WageEmployee extends Employee{
	private int hrs;
	private int rate;
	double computeSalary() {
		double da = 0.2*super.salary;
		double hra = 0.3*super.salary;
		double gross_salary = super.salary+da+hra;
		return gross_salary;
	}
	WageEmployee(){
		hrs = 100;
		rate = 10;
	}
	WageEmployee(int hrs, int rate){
		this.hrs = hrs;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "WageEmployee [hrs=" + hrs + ", rate=" + rate + ", salary=" + salary + ", Gross Salary="
				+ computeSalary()+ "]";
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {
		WageEmployee we = new WageEmployee();
		System.out.println(we);
	}

}
