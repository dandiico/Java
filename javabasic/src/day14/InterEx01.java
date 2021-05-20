package day14;

interface Test {
	//public static final int NUM = 1; // 상수
	//public abstract void add(); // 추상메소드
	// 생략 가능
	final int NUM = 1; // 상수
	void add(); // 추상메소드
	
}
interface Test2{
	void sub();
}
class A {}
class B {}
class Inter extends A implements Test, Test2 { // 다중구현도 되고 상속도 받을 수 있음, class니까 상속은 하나 받을 수 있음
	public void add() { // 부모 Test interface의 추상메소드는 public 이기 때문에 public으로 오버라이딩
		System.out.println("implements");
	}
	public void sub() {
		System.out.println("Test2");
	}
	
}

public class InterEx01 {

	public static void main(String[] args) {
		Inter i = new Inter();
		i.add();
		//System.out.println(i.NUM);
		//System.out.println(Test.NUM); // 상수는 바로 사용 가능
		
		// 다형성
		Test t = new Inter();
		
		Test t2 = new Inter();
		A a = new Inter();
		
		
		
	}

}
