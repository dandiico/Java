package day13;
class Super{
	void add() {
		System.out.println("Super");
	}
}
class Sub extends Super{ // add() ->@add()
	// 오버라이딩
	@Override
	void add() {
		super.add();
		System.out.println("Sub");
		System.out.println("Sub");
		System.out.println("Sub");
	}
}

public class InheritEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.add();
		

	}

}
