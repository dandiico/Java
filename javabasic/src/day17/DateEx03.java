package day17;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateEx03 {

	public static void main(String[] args) {
		// 날짜 입력받아 현재 시간과의 차이 출력
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern); // 부모 타입으로 형변환
		Scanner sc = new Scanner(System.in);
		
		Date date = null;
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요>> ");
		String str = sc.nextLine();
		try {
		date = df.parse(str); // 패턴에 맞는 문자열을 주면, Date 객체로 변환
		System.out.println(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// Date > Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Calendar today = Calendar.getInstance();
		long day = Math.abs(((cal.getTimeInMillis()- today.getTimeInMillis())/(24*60*60*1000)));
		System.out.println("차이: " + day + "일");
	}

}
