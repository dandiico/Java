package day09;
class Test {
	/*
	 * 메모리 로딩 순서
	 * 클래스 > static > main실행 > (new~)instance
	 * 클래스 범위
	 * */
	
	//static int x = y; // y는 만들어지기 전이기 때문에 불가능, 종류가 달라서
	//int y = 10; // 클래스 안 static 안붙여있음, 인스턴스변수>객체 생성해야지만 유효
	
	// static이 붙은 변수는 프로그램 시작시 먼저 메모리에 로딩되어 사용준비가 된다.
	// 선언할때 인스턴스가 먼저 작성되었다고 혼동하시면 안된다
	// 메서드 안에서만 위에서 아래로 실행, class 안에서는 그냥 나열
	// 시각적으로 이해하기 쉽게 static 먼저 쓰는게 좋다.
	int y = x;
	static int x = 100;
	
}

// 클래스
public class ClassEx05 {
	
	// 이곳에도 변수 선언 가능
	static int a = 100;
	int i = 20;
	
	// 메인 메서드
	public static void main(String[] args) {
		
		System.out.println(Test.x);
		
		Test t = new Test();
		System.out.println(t.y);
		
		System.out.println(ClassEx05.a);
		System.out.println(a); // 같은 static 클래스 안에 있으면 변수명만 불러도 된다, 메모리 생성 시기가 같으면 이름만 불러도됨
		
		ClassEx05 cls = new ClassEx05();
		System.out.println(cls.i); 
		
		// 단발성, 1회성으로 한번만 i의 값을 출력하고 말겠다 (간혹 쓰임)
		System.out.println(new ClassEx05().i);
		
		
		
	}

}
