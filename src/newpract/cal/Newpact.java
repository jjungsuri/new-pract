package newpract.cal;

import java.util.Scanner;

public class Newpact {	
	private static final int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
  
	public int maxDaysCalculate(int i){
   	return mon[i-1];
	}
	
	
	public static void main(String[] args) {
		System.out.println("일   월   화     수   목    금    토");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
//		입력받은 숫자 달의 최대 일수 출력하기
		int i=0;
		String str;
		Scanner scan= new Scanner(System.in);
//		str=scan.next();
//		i=Integer.parseInt(str);
		i=scan.nextInt();
		
		if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){System.out.println
		("month's day is 31days ");
		
		}else if(i==4||i==6||i==9||i==11){System.out.println
		("month's day is 30days ");
		
		}else{System.out.println("month's day is 28days ");		
		}
	 

	switch(i){
	case 1:
		System.out.println("31days");
			break;	
	case 2:
		System.out.println("28days");
			break;		
	case 3:
		System.out.println("31days");
			break;
	case 4:
		System.out.println("30days");
			break;		
	case 5:
		System.out.println("31days");
			break;		
	case 6:
		System.out.println("30days");
			break;		
	case 7:
		System.out.println("31days");
			break;		
	case 8:
		System.out.println("31days");
			break;		
	case 9:
		System.out.println("30days");
			break;		
	case 10:
		System.out.println("31days");
			break;					
	case 11:
		System.out.println("30days");
			break;		
	case 12:
		System.out.println("31days");
			break;		
	}	
	
	
	 System.out.println(i+ "월은"  +(mon[i-1])+"일 까지이다");
	}
	
}	

