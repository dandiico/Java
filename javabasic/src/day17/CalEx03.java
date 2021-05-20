package day17;

import java.util.Calendar;

public class CalEx03 {

	public static void main(String[] args) {

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		long difference = (time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
		System.out.println(difference);
		
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간","분","초"};
		
		String tmp= "";
		for(int i = 0; i < TIME_UNIT_NAME.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i]; // diff/3600 + 시간
			difference %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면: " + tmp);
		
		
		
	}

}
