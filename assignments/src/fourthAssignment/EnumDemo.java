//10.Declare enum of weekday: Print number with day
//Hint: public enum day{SUNDAY (0), MONDAY (1)}
//Print: 0 SUNDAY 1 MONDAY

package fourthAssignment;
enum WeekDays{
	SUNDAY(0),
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THIRSDAY(4),
	FRIDAY(5),
	SATURDAY(6);
	final int dayNumber;
	
	WeekDays(int dayNumber){
		this.dayNumber = dayNumber;
	}

	public int getDayNumber() {
		return dayNumber;
	}
	
}
public class EnumDemo {

	public static void main(String[] args) {
		for(WeekDays day:WeekDays.values()) {
			System.out.println(day+" ("+day.dayNumber+")");
		}
	}
}
