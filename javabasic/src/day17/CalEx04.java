package day17;

import java.util.Calendar;

public class CalEx04 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		date.set(2021, 4, 31);
		System.out.println(dateToString(date));
		System.out.println("- 1일 후 -");
		date.add(Calendar.DATE, 1); // int field> 내부로직 때문에 상수
		System.out.println(dateToString(date));
		
		System.out.println("- 3달 전 -");
		date.add(Calendar.MONTH, -3);
		System.out.println(dateToString(date));
		
		System.out.println("- 31일 후 roll -");
		date.roll(Calendar.DATE, 31); // 날짜만 돌아감
		System.out.println(dateToString(date));
		System.out.println("- 31일 후 add -");
		date.add(Calendar.DATE, 31);
		System.out.println(dateToString(date));
	} 
	
	
	public static String dateToString(Calendar date) {
		// date.get(Calendar.DAY_OF_WEEK) > 1~7 > 인덱스 번호로 활용
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		return date.get(Calendar.YEAR) + "년 " +(date.get(Calendar.MONTH)+1) + "월 "
				+ date.get(Calendar.DATE)+ "일 " + 
				DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]+ "요일";
	}

}
