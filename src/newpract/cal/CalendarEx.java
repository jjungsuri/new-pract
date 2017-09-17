package newpract.cal;

public class CalendarEx {

	private static final int[] maxDay = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] leapMaxDay = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapMaxDay(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDay(int year, int month) {
		if (isLeapMaxDay(year)) {
			return leapMaxDay[month];
		} else {
			return maxDay[month];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.println("<<" + year + "  " + month + ">>");
		System.out.println("  su  mo  tu  we  th  fr  sa");

		int weekFirstDay = getWeekDay(year, month, 0);
		/* 해당월 전월의 마지막 주일 해당 일수 */
		for (int i = 0; i < weekFirstDay; i++) {
			System.out.print("    "); /* 첫 주일 중 공일 */
		}
		int monthDay = getMaxDay(year, month);
		for (int i = 1; i <= monthDay; i++) { /* 1 부터 시작함으로 <= 적용 */
			System.out.printf("%4d", i);
			if ((i + weekFirstDay) % 7 == 0) /* 7일씩 줄바꿈 */
				System.out.println();

		}

	}

	public int getWeekDay(int year, int month, int day) {
		int firstYear = 1970;
		int firstDayWeek = 4; /* 1970.1.1 thursday 부터 해당 연도의 전년도 까지 일수 산출하고+*/
		int count = 0;        /* 해당연도의 1월부터 해당월 전월까지 일수 산출하여 %7 산출*/
		int delta = 0;       /*   그것을 해당월의 공백일에 포함 해당월 초일 산출함*/

		for (int i = firstYear; i < year; i++) {
			delta = isLeapMaxDay(i) ? 366 : 365;/* boolean 이냐 그러면 366,아니면 365 */
			count += delta; /* 해당 연도의 전연도 까지 일수 계산 */
		}

		for (int i = 1; i < month; i++) {
			delta = getMaxDay(year, i);
			count += delta; /* 해당년도의 해당월 전월까지 일수 계산 */
		}

		count += day;
		int weekFirstDay = (count + firstDayWeek) % 7;
		/* 해당월 전월의 마지막 주일 해당일수 산출 */
		return weekFirstDay;
	}

}
