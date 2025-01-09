//6. Consider you are working for Xyz Company and developing a payroll software
//Construct a class employee with following member using private access
//specifier:
//1. employeeId integer
//2. employeName string
//3. basicSalary double
//4. hra double
//5. medical double
//6. pf double
//7. pt double
//8. netSalary double
//9. grossSalary double
//Please use following expressions for calculations.
//a. hra=50% of basic salary
//b. pf=12% of basic salary
//c. pt=Rs.200
//1.Write no arguments constructor and parameterized constructor to initialize
//objects.
//2.Write properties for employeId, employeeName, basic salary, netSalary and
//grossSalary
//3.Write methods to display the details of an employee and calculate the gross
//and the net salary. gross salary=basic salary+hra+medical
//net salary=gross salary-(pt+pf)

package thirdAssignment;

class Employee{
	private int employeeId;
	private String employeeName;
	private double basicSalary, medical, netSalary, grossSalary, hra, pf, pt;
	public void getEmployeeDetails() {
		hra = 0.5*basicSalary;
		pf = 0.12*basicSalary;
		pt = 200;
		grossSalary = basicSalary+hra+medical;
		netSalary = grossSalary-(pt+pf);
		System.out.println("Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]");
	}
	Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}
	Employee() {
		employeeId = 1;
		employeeName = "Srushti";
		basicSalary = 4000;
		medical = 100;
	}
	
	
}

public class Six {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee(1, "Srushti", 5000, 100);
		
		emp.getEmployeeDetails();
		emp1.getEmployeeDetails();
	}

}
