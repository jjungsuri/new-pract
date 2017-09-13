package newpract.cal;

import java.util.Calendar;
import java.util.Scanner;

public class NewpactEx {
  private static int []month={31,28,31,30,31,30,31,31,30,31,30,31};
	public static int getMaxDaysOfMonth(int i) {
	       return month[i-1];	
	}

	public static void main(String[] args) {
		
		String PROMPT="<cal> ";
		System.out.println("월을 입력하세요");
		Scanner scan = new Scanner(System.in);
//		 Calendar cal=Calendar.getInstance();
		int repeat = scan.nextInt();		
		
		for(int i=0; i<repeat; i++){
//			System.out.println("달을 입력하세요");
			System.out.println(PROMPT);
			int month=scan.nextInt();
			System.out.println(month + "월은" + (int)getMaxDaysOfMonth(month) + "일입니다");
		}
		
	
		scan.close();
	}

}
