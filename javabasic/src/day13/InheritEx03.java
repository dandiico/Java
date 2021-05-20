package day13;

class A{
	A(){
		System.out.println("생성자 A");
	}
}

class B extends A{
	B(){
		System.out.println("생성자 B");
	}
}

class C extends B{
	C(){
		System.out.println("생성자 C");
	}
}

public class InheritEx03 {
	public static void main(String[] args) {
		C c = new C();
		
		
	}
}
