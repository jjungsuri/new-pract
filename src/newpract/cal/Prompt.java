package newpract.cal;

import java.util.Calendar;
import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";
	Newpact npt= new Newpact();
	public void runPrompt() {
	    Scanner scan = new Scanner(System.in);
	    Calendar cal=Calendar.getInstance();
		
		int month =-1;		
        int year=-1; 
		while (true) {
			System.out.println("연도을 입력하세요");
			System.out.print("YEAR> ");
			year = scan.nextInt();	
			System.out.print("MONTH> ");
			month = scan.nextInt();	
			
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}

			npt.printCalendar(year,month);
		}
			System.out.println("Bye~");
			scan.close();
			cal.clone();
			
		}
	

	public static void main(String[] args) {
		Prompt prt=new Prompt(); 
		 prt.runPrompt();
	}
}