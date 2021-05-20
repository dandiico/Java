package day11;

public class ClassEx30 {
	
	// 클래스 변수
	static int x = 10;
	
	// 클래스 블럭 : 프로그램 실행시 한번 자동 호출
	static {
		System.out.println("클래스 초기화 블럭");
		x = 100; // 클래스 변수 초기화
	}
	
	// 인스턴스 블럭
	{
		System.out.println("인스턴스 블럭");
	}
	
	ClassEx30(){
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		ClassEx30 c = new ClassEx30(); // 객체 생성시 인스턴스 블럭 자동 호출
		ClassEx30 c1 = new ClassEx30();
		
	
	}
}
