package newpract.cal;

import java.util.Calendar;
import java.util.Scanner;

public class NewpactEx {
//    private static int []month={31,28,31,30,31,30,31,31,30,31,30,31};
	public static int getMaxDaysOfMonth(int month){	
		if(month==2){
			return 28;			
		}else if(month==4||month==6||month==9||month==11){
			return 30;
		}else{
			return 31;
		}
		 
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("월을 입력하세요");
		Scanner scan= new Scanner(System.in);
//		Calendar cal=Calendar.getInstance();
		int month=scan.nextInt();	
	System.out.println(month+ "월은"+ getMaxDaysOfMonth(month) +"일입니다");
	scan.close();
	}
	
}
