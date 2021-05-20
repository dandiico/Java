package day17;

import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {

		// 클래스가 자동으로 안잡힐때, "java.util.Date" 클래스 전체 이름만 알때, 클래스의 경로
		try {
		Class cls = Class.forName("java.util.Date");
		// Date cls = new Date();
		Object obj = cls.newInstance(); // new Date(); // 뭐가 될지 모르지만 객체 생성 해주는것
		if(obj instanceof Date) {
			Date d = (Date)obj;
			System.out.println(d);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	// D-day 계산기 만들기
	Date day1 = new Date();
	Date day2 = new Date();
	day1.g


	}
}
