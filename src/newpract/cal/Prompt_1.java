package newpract.cal;

import java.util.Calendar;
import java.util.Scanner;

public class Prompt_1 {

	Calendar_1 calend = new Calendar_1();
	String weekDays[] = { "su", "mo", "tu", "we", "th", "fr", "sa" };

	public int parseDay(String weekday) {
		int index = 0;
		for (int i = 0; i < weekDays.length; i++) {
			if (weekday.equals(weekDays[i])) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void runPrompt() {
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		int month = -1;
		int year = -1;
	
		while (true) {
			System.out.println("연도을 입력하세요. [exit:-1}");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			if(year==-1)
				break;
			System.out.print("MONTH> ");
			month = scan.nextInt();

		
		

			if (month>12||month <1) {
				System.out.println("Wrong !!");
				break;
			}
			if (month > 12) {
				continue;
			}

		calend.printCalendar(year, month);
		}
		System.out.println("Bye~");
		scan.close();
		cal.clone();

	}

	public static void main(String[] args) {
		Prompt_1 prt = new Prompt_1();
		prt.runPrompt();
	}
}