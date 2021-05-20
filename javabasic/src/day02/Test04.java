package day02;

public class Test04 {

	public static void main(String[] args) {
		
		byte b = 127;
		System.out.println(b);
		
		
		// 오버플로우 -128~127, 강제 형변환
		b = (byte)128;
		System.out.println(b);
		
		// 문자열 String (참조형) : 데이터는 반드시 쌍따옴표로 묶는다
		String a = "abc";
		System.out.println(a);
		
		char ch = '\u0041';
		System.out.println(ch);
		
		// int : 10진수 / 8진수 : 0으로 시작하는 수 / 16진수 : 0x로 시작
		// 2진수 : 0b로 시작

		int i = 15;
		System.out.println(i);
		int j = 015;
		System.out.println(j);
		int k = 0x15;
		System.out.println(k);
		int l = 0b0101;
		System.out.println(l);
		
	}

}
