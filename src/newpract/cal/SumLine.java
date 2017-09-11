package newpract.cal;

import java.util.Scanner;

public class SumLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("숫자 2개를  입력하세요");
		Scanner scanner=new Scanner(System.in);
		String a1=scanner.next();
		String a2=scanner.next();
		a=Integer.parseInt(a1);
		b=Integer.parseInt(a2);
		System.out.printf("a와 b는 " +a + "," + b + "이고  합은 "+ (a+b) +" 이다");

	}


}
