package day13;

class A2{
	A2(){
		System.out.println("생성자 A");
	}
	A2(int x){
		System.out.println("생성자 A_param :" + x);
	}
}
class B2 extends A2{
	B2(){
		//super(); // 명시적으로 작성하면 좋지만 생략하여도 컴파일러가 부모의 기본생성자를 호출
		super(200); // 나는 기본, 부모클래스는 매개변수 던지것 호출
		System.out.println("생성자 B");
	}
	B2(int x){
		super(x); // 부모 생성자 호출
		System.out.println("생성자 B-param :" + x);
	}
}
public class InheritEx05 {
	public static void main(String[] args) {
		B2 b = new B2(10);
	}
}
