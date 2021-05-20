package day17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		Date day = new Date();
		System.out.println(day);
		System.out.println(day.getMonth() + 1);
		
		//원하는 날짜 포맷으로 출력하고 싶을때 (날짜 데이터는 없다)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 입니다.");
		System.out.println(sdf.format(day));
		
	}

}
