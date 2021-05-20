package day11;
// default 클래스 : 같은패키지만 공개
class Sample{
	// 공개범위가 다른 인스턴스 변수
	public int a; // 전체
	private int b; // 같은 클래스 내
	protected int c; // 같은 패키지, 다른패키지라도 자식이면 허용
	int d; // 같은 패키지 내
}

// public 클래스 : 전체공개
public class ClassEx40 {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;
		//s.b = 20; 접근 불가, 부르고 있는 위치가 ClassEx40의 main이기 때문에
		s.c = 30;
		s.d = 40;
		
	}

}
