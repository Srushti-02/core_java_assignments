package eighthAssignment;

import java.util.Scanner;

class DateException extends Exception{
	public DateException(String m) {
		super(m);
	}
}
class MonthException extends Exception{
	public MonthException(String m) {
		super(m);
	}
}

class Date{
	int date, month, year;
	
	void check() throws DateException, MonthException {
		if(date < 1 || date > 31) {
			throw new DateException("Invalid Date");
		}
		
		if(month < 1 || month > 12) {
			throw new MonthException("Invalid Month");
		}
	}
	Date(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}
}
public class DateClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dt = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		Date date = new Date(dt, month, year);
		try {
			date.check();
			System.out.println(dt+"/"+month+"/"+year);
		} catch (DateException | MonthException e) {
			System.out.println(e.getMessage());
		}
	}

}
