package day03;

public class Test19 {

	public static void main(String[] args) {
		
		// 대입연산자 : = : 대입을 해야 변수안의 값이 변경됨
		
		int a = 10;
		System.out.println(a + 10);
		System.out.println(a);
		
		System.out.println(a = a + 10);
		System.out.println(a);
		
		// 복합대입 연산자 : 산술 + 대입
		// += -= *= /= %=
		int b = 10;
		System.out.println(b);
		b += 10; // b = b + 10;
		System.out.println(b);
		
		int c = 5;
		c += 1; // c++
		System.out.println(c);
		


	}
}
