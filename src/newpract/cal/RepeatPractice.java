package newpract.cal;

import java.util.Scanner;

public class RepeatPractice {

	public void repeatTimes() {
		int va = 0;
		String str;

		System.out.println("반복 입력할 숫자를 입력해 주세요");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		va = Integer.parseInt(str);

		System.out.println(va + "를 입력하셨습니다." + va + "만큼 반복 입력해 주세요" + "\n");
		repeatedInput(va);
		scan.close();
	}

	public void repeatedInput(int var) {
		String st;
		;
		int va1 = 0;

		for (int i = 0; i < var; i++) {
			Scanner scanner = new Scanner(System.in);
			st = scanner.next();
			va1 = Integer.parseInt(st);

			System.out.println((i+1)+"번째 입력 값: "+va1 + "\n");
			System.out.println("--------------");
			if ((i + 1) == var)
				scanner.close();

		}

		// System.out.println("");
	}

	public static void main(String[] args) {
		RepeatPractice rpt = new RepeatPractice();

		rpt.repeatTimes();
	}

}
