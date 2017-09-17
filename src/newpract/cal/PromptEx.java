package newpract.cal;
import java.util.Scanner;

public class PromptEx {	
	
	CalendarEx cal=new CalendarEx();
	
	public void runPrompt(){
	Scanner scanner=new Scanner(System.in);

	int year=0;
	int month=0;
	
	while(true){
		System.out.println("연도를 입력하세요");
		System.out.println("YEAR");
		year=scanner.nextInt();
		System.out.println("월을 입력하세요");
		System.out.println("MONTH");
		month=scanner.nextInt();

		if (month>12||month <1) {
			System.out.println("Wrong !!");
			break;
		}
		if (month > 12) {
			continue;
		}
		cal.printCalendar(year,month);	
		System.out.println();
		System.out.println( "exit: -1");
		
	}
	    scanner.close();   
}
	
	public static void main(String[] args) {
		PromptEx pmt=new PromptEx();
		pmt.runPrompt();
		// TODO Auto-generated method stub
         
	} 
}
   
