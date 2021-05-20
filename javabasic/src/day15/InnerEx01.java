package day15;
// inner 클래스 만들기
class A {
	A(){System.out.println("A 객체 생성");}
	// 인스턴스 멤버 클래스
	class B{
			B(){System.out.println("B 객체 생성");}
			int x;
			void func1(){ System.out.println("B클래스 메소드 실행"); }
			// static 불가
	}
	static class C {
		C() {System.out.println("C 객체 생성");}
		int x;
		void func1(){ System.out.println("C클래스 메소드 실행"); }
		static int y;
		static void fun2() {System.out.println("C클래스 static 메소드 실행");}
	}
	// 인스턴스 메소드
	void methodA() {
		System.out.println("메소드 A 호출");
		class D{
			D() {System.out.println("D 객체 생성");}
			int x;
			void func1() {System.out.println("D클래스 메소드 실행");}
		}
		// 지역 클래스 객체 생성
		D d = new D();
		System.out.println(d.x);
		d.x = 300;
		System.out.println(d.x);
	}
}



public class InnerEx01 {

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스 객체 생성
		System.out.println("인스턴스 멤버 클래스 객체 생성");
		A a = new A(); // 외부 클래스 객체 생성
		A.B b = a.new B(); // 외부클래스 참조변수명.new 내부클래스명();
		System.out.println(b.x);
		b.x = 10;
		System.out.println(b.x);
		System.out.println("---------------");
		
		// static 멤버 클래스 객체 생성
		System.out.println("static 멤버 클래스 객체 생성");
		A.C c = new A.C();
		System.out.println(c.x); // 인스턴스 변수
		c.x = 100;
		System.out.println(c.x);
		System.out.println(A.C.y); // static 변수
		c.func1();
		System.out.println("---------------");
		
		// 지역 메소드 호출
		System.out.println("지역 메소드 호출");
		A a1 = new A();
		a1.methodA();
		
	}

}
