package newpract.cal;

import java.util.Calendar;
import java.util.Scanner;

public class ResisterMenu {
	ResisterWorking rw= new ResisterWorking();
	
	public void printMenu() {
		System.out.println("|+----------------+");
		System.out.println("| 1.일정 등록");
		System.out.println("| 2.일정 검색");
		System.out.println("| 3.달력 보기");
		System.out.println("| h.도움말  q.종료");
		System.out.println("|+----------------+");
	}

	public void runPrompt() {
		printMenu();
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		while (true) {
			System.out.println();
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = sc.next();
			if (cmd.equals("1"))
				cmdResister(sc, cal);
			else if (cmd.equals("2"))
				cmdSearch(sc);
			else if (cmd.equals("3"))
				cmdCal(sc, cal);				
			else if (cmd.equals("h"))
				printMenu();
			else if (cmd.equals("q"))
				break;
		}
		System.out.println("thankyou Bye! ");
	}

	private void cmdCal(Scanner sc, Calendar cal) {
		int year = 1970;
		int month = 1;
		System.out.println("put the year");
		System.out.println("YEAR");
		year = sc.nextInt();
		System.out.println("put the month");
		System.out.println("MONTH");
		month = sc.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("Wrong !!");
			return;
		}
		 rw.printCalendar(year, month);
		System.out.println();

	}

	private void cmdSearch(Scanner sc) {
		System.out.println("일정 검색");
		System.out.println("put the date for search(yyyy-MM-dd)");
		String date=sc.next();
		String plan="";
		plan=rw.searchPlan(date);/* send date and take plan from searchPlan()*/
		System.out.println(plan);
		
		
	}

	private void cmdResister(Scanner sc,Calendar cal) {
		System.out.println("새일정 등록");
		System.out.println("put the date for search(yyyy-MM-dd)");
		String date=sc.next();	
		sc.nextLine(); //// important!
		
		System.out.println("put the schedule");
		String text="";
		text=sc.nextLine();
		rw.resisterPlan(date,text);
	}

	public static void main(String[] args) {
		ResisterMenu rm=new ResisterMenu();
		rm.runPrompt();
	}

}
