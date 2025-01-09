package thirdAssignment;
import java.util.Scanner;
//Write an Account class with default constructor, parameterised constructor and
//methods toString(), deposit(int amt), withdraw(int amt). withdraw method
//should take care of insufficient balance. Accept the values from the user..Display
//the details of various Accounts
class Account{
	private int amt;
	private int bankBalance = 5000;
	public void deposit(int amt) {
		bankBalance += amt;
		System.out.println("Amount deposited successfully.");
	}
	public void withdraw(int amt) {
		if(amt > bankBalance) {
			System.out.println("Insufficient Balance");
		} else {
			bankBalance-=amt;
			System.out.println("Amount has been withdrawn successfully.");
		}
	}
	
	Account(){
		System.out.println("Default Constructor is invoked");
	}
	Account(int amt){
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Account [amt=" + amt + ", bankBalance=" + bankBalance + "]";
	}
}

public class One {
	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println(ac);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the amount : ");
		int amt = sc.nextInt();
		System.out.println("1. Deposite the amount\n2. Withdraw the amount");
		System.out.print("Please Enter the choice : ");
		int choice = sc.nextInt();
		sc.close();
		
		
		Account ac1 = new Account(amt); 
		switch(choice) {
		case 1:
			ac1.deposit(amt);
			System.out.println(ac1);
			break;
		case 2:
			ac1.withdraw(amt);
			System.out.println(ac1);
			break;
		default:
			System.out.println("Incorrect choice");
		}
		
	}

}

