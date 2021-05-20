package day17;
import java.util.Calendar;
public class CalEx01 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		// 년도
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); // MONTH 0월 ~ 11월
		System.out.println(year);
		System.out.println(month);
		int day_of_week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(day_of_week);
		// 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		
	}
}
