package day13;
class AClass { int x; } // x
class BClass extends AClass { int y; } // x, y

public class PolyEx01 {

	public static void main(String[] args) {
		
		// 다형성 : 부모의 변수에 자식 객체를 담는것
		AClass aa = new BClass();
		//BClass bb = new AClass(); Error
		
		// 형변환
		//int a = 10;	// 조상 : 정수
		//double d = (double)a; // 자손 : 정수, 실수

		//double d = 5.7;	// 조상 : 정수, 실수
		//int a = (int)d; // 자손 : int 타입임으로 정수만 사용가능
		
		// 기존 객체 생성 방법
		AClass a = new AClass();
		BClass b = new BClass();
		
		
	}

}
