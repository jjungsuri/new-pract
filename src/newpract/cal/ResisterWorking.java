package newpract.cal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ResisterWorking {
	
	private static final int[]MONTH_DAY={0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[]LEAP_MONTH_DAY={0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	private HashMap<Date,String>planMap;
	
	public ResisterWorking(){
		planMap=new HashMap<Date,String>();
	}
	
	public void resisterPlan(String strDate, String plan){
		try {
			Date date =new SimpleDateFormat("YYYY-MM-DD").parse(strDate);
			planMap.put(date,plan);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public String searchPlan(String strDate){
		Date date;
		try {
			date=new SimpleDateFormat("YYYY-MM-DD").parse(strDate);
			String valuePlan=planMap.get(date);
			return valuePlan;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strDate;
	}

	public boolean isLeapMonthDay(int year){
		if(year%4==0 && year%100!=0||year%400==0)
			return true;    
		else
			return false;
	}
	
	public int getMonthDay(int year, int month){
		if(isLeapMonthDay(year)) 
			return LEAP_MONTH_DAY[month];
		else
			return MONTH_DAY[month];
		
	}
	
	public int getFirstOfWeekDay(int year,int month, int day){
		/* 1970년1.1부터 일수 환산  산출 (해당년도의 전년도 까지 일수 + 금년도 해당월 */
		/*  까지일수(+4) %7 < 1970.1.1 목요일 임에 +4 해야함)= 금월의 첫 주일 공란수*/
		/* ?? int firstOfWeek=getFirstOfWeekDay(year,month,1) "1" 이고 */
			/*	 count+=day+1;	이었음*/ 
		int firstYear=1970;
		int firstDayOfWeekIndex=4;
		int count=0;
		int delta=0;
		
		for(int i=firstYear; i<year; i++){
			delta=isLeapMonthDay(i)?366:365;
			count+=delta;			
		}
		
		for(int i=1; i<month; i++){
			delta= getMonthDay(year,i);
			count+=delta;
		}
		
		count+=day; /* day-1에서 1을 삭제함*/
		int firstOfWeek =(count+firstDayOfWeekIndex)%7;
		return firstOfWeek;				
								
	}    
	
	public void printCalendar(int year,int month){
		System.out.println("     <<"+" "+ year+"  "+ month +" "+">>");
		System.out.println("   일   월   화   수   목   금   토 ");
		
	int firstOfWeek=getFirstOfWeekDay(year,month,0);/*0으로 함--?*/
		for(int i=0; i<firstOfWeek; i++){
			System.out.print("   ");
		}
		
	    	int maxMonth=getMonthDay(year,month);
		for(int i=1; i<=maxMonth; i++){
				
			System.out.printf("%3d" ,i);
			if((firstOfWeek+i)%7==0){	
		    System.out.println();
		}
	
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
