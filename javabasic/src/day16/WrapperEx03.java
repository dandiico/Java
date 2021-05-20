package day16;

public class WrapperEx03 {

	public static void main(String[] args) {

		// 문자열 >> 기본타입 변환
		int i = Integer.parseInt("123");
		System.out.println(i);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		double d = Double.parseDouble("3.14515");
		System.out.println(d);
		
		// 기본타입 >> 문자열로 변환
		String s1 = Integer.toString(123); // Double, Float, Boolean, Byte...
		System.out.println(s1);
		
		String s2 = Integer.toBinaryString(123); // 2진수로 변환
		System.out.println(s2);
		
		// 타입 알아보기
		int x = 10;
		Object obj = x;
		System.out.println(obj.getClass());
		
		Integer iii = new Integer(100);
		Integer ii = new Integer(100);
		System.out.println("iii == ii :" + (iii == ii));
		System.out.println("iii equals ii :" + (iii.equals(ii)));
		
		
	}

}
