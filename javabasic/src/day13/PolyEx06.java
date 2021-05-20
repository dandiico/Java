package day13;

class Poly1 { // a, abc()
	int a = 10;
	void abc() {
		System.out.println("abc");
	}
}
class Poly2 extends Poly1{ // a, b, abc(), def
	int b = 100;
	void def() {
		System.out.println("def");
	}
}

public class PolyEx06 {

	public static void main(String[] args) {
		
		Poly1 p1 = new Poly1();
		Poly2 p2 = new Poly2();
		// 다형성
		Poly1 p3 = new Poly2();
		Poly2 p4 = (Poly2)p3;
		
		
	}

}
