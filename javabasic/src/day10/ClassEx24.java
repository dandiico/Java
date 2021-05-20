package day10;
// 메서드 오버로딩
public class ClassEx24 {
	
	// 성립
	// 매개변수 개수차이
	int getSum(int a, int b) {
		return a + b;
	}
	int getSum(int a, int b, int c) {
		return a + b + c;
	}
	// 매개변수 타입차이
	int getMul(int a, int b) {
		return a * b;
	}
	int getMul(int a, double d) {
		return a * (int)d;
	}
	
	// 성립 안됨
	/* 매개변수 개수와 타입이 동일해서 안됨. 리턴타입은 논외
	int getSub(int a, int b) {
		return a - b;
	}
	double getSub(int a, int b) {
		return (double)a - b;
	}
	
	int getDiv(int a, int b) {
		return a / b;
	}
	int getDiv(int c, int d) {
		return c / d;
	}
	 */
	
	public static void main(String[] args) {
	
		ClassEx24 cls = new ClassEx24();
		System.out.println(cls.getSum(4,5));
		System.out.println(cls.getSum(5,6,8));
		System.out.println(cls.getMul(5, 10));
		// 메서드 오버로딩은 자바 컴파일러에 의해 판단되며,
		// 컴파일러가 이름이 같은 메서드들을 구분할 수 있으면 오버로딩 성공
		// 컴파일러가 이름과 매개변수의 개수/타입 일치하는 메서드를 찾아냄.
		
		
		
		
		
		

	}

}
