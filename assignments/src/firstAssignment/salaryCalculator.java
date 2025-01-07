package firstAssignment;

//3. Accept basic salary via and calculate the following
//DA=20% of basic
//HRA=30% of basic
//Calculate gross salary GROSS=BASIC+DA+HRA
//Calculate the Income tax (IT) based on the following condition
//SAL RANGE IT
//-------------------------------------------------------------------
//Basic >0 and basic < 4000 4%
//Basic >=4000 and basic < 10000 6%
//Basic >=10000 and basic < 17000 8%
//Basic >=17000 and basic < 27000 10%
//Basic >=27000 onwards 15%


public class salaryCalculator {

	public static void main(String[] args) {
		int salary = Integer.parseInt(args[0]);
		double da = 0.2*salary;
		double hra = 0.3*salary;
		double gross_salary = salary+da+hra;
		
		if(salary > 0 && salary < 4000) {
			gross_salary *= 0.04;
		}
		else if(salary >= 4000 && salary < 10000) {
			gross_salary *= 0.06;
		}
		else if(salary >= 10000 && salary < 17000) {
			gross_salary *= 0.08;
		}
		else if(salary > 17000 && salary < 27000) {
			gross_salary *= 0.1;
		}
		else {
			gross_salary *= 0.15;
		}
		
		System.out.println("Final Gross Salary is " + gross_salary);
	}

}
