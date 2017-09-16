package newpract.cal;

public class Calendar_1 {
	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("  <<%4d년 %3d월>>\n", year, month);
		System.out.println(" su mo tu we th fr sa");
		System.out.println("-------------------");

		int weekdayNo = getweekDay(year, month, 0);

		for (int j = 0; j < weekdayNo; j++) {
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((i + weekdayNo) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private int getweekDay(int year, int month, int day) {
		int syear = 1970;
		final int sTANDARD_WEEKDAY = 4;// 1970년1월1일 목요일 (%7=3)
		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}

		count += day ;

		int weekday = (count + sTANDARD_WEEKDAY) % 7;
		return weekday;

	}

	public static void main(String[] args) {
		Calendar_1 cal = new Calendar_1();
//		System.out.println(cal.getweekDay(1970, 1, 1) == 3);
//		System.out.println(cal.getweekDay(1971, 1, 1) == 4);
//		System.out.println(cal.getweekDay(1972, 1, 1) == 5);
//		System.out.println(cal.getweekDay(1973, 1, 1) == 0);
//		System.out.println(cal.getweekDay(1974, 1, 1) == 1);
	}

}
