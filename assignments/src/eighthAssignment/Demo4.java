package eighthAssignment;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String m) {
		super(m);
	}
}
class Account{
	private int amt;
	private int bankBalance = 5000;
	public void deposit(int amt) {
		bankBalance += amt;
		System.out.println("Amount deposited successfully.");
	}
	public void withdraw(int amt) throws InsufficientFundsException {
		if(amt > bankBalance) {
			String m = "Insufficient Fund";
			throw new InsufficientFundsException(m);
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

public class Demo4 {

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
		
		
		switch(choice) {
		case 1:
			ac.deposit(amt);
			System.out.println(ac);
			break;
		case 2:
			try {
				ac.withdraw(amt);
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(ac);
			break;
		default:
			System.out.println("Incorrect choice");
		}
	}

}
