//5. Write a TestEmployee class to print the details of all types of employees
////(use array[] of Employee Objects)

package fifthAssignment;

class Employee1{
	int id;
	String name;
	double salary;
	
	Employee1(){
		id = 1;
		name = "srushti";
		salary = 5000;
	}
	Employee1(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

class FullTimeEmployee extends Employee1{
	FullTimeEmployee(){
		this.id = super.id;
		this.name = super.name;
		this.salary = super.salary;
	}
	
	FullTimeEmployee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

class PartTimeEmployee extends Employee1{
	PartTimeEmployee(){
		this.id = super.id;
		this.name = super.name;
		this.salary = super.salary;
	}
	
	PartTimeEmployee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class DemoTestEmployee {

	public static void main(String[] args) {
		Employee1 emp[] = new Employee1[3];
		emp[0] = new FullTimeEmployee();
		emp[1] = new FullTimeEmployee(2, "Shriyog", 2000);
		emp[2] = new PartTimeEmployee(3, "Anuradha", 5000);
		
		for(Employee1 employee:emp) {
			System.out.println(employee);
		}
	}

}
