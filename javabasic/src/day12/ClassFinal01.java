package day12;
// final
/*
final class SuperClass{
	
}
class SubClass extends SuperClass{ // SuperClass로 상속 받을 수 없다
	
}
*/
class SuperClass{
	final void add() {}
}
class SubClass extends SuperClass{ // SuperClass로 상속 받을 수 없다
	// 오버라이딩 : 부모로부터 물려받은 add()메소드의 내부 기능이 맘에 안들어 내가 다시 덮어쓰기함
	//void add() {System.out.println("hello");
}

public class ClassFinal01 {

	final static int x = 10; // 클래스 상수
	final int y = 20; // 인스턴스 상수
	
	public static void main(String[] args) {

		//x = 100;
		ClassFinal01 c = new ClassFinal01();
		//c.y;
		final int z = 30; // 지역 상수
		//z = 100;		
	}

}
