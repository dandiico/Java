package day03;

public class Test16 {

	public static void main(String[] args) {
		
		// 사칙연산 : + - * / % [나머지값]
		int a = 10 % 3;
		System.out.println(a);
		
		a = 100000 * 100000; // int * int 100억 처리할 수 없음
		System.out.println(a);
		long l = 100000L * 100000; // long * int > long * long = long
		System.out.println(l);
		
	}

}
