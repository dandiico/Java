package day12;
// 상속
class Super{	// 부모클래스 : x
	static int a = 100;
	int x =10;
}
class Sub extends Super{	// 자식 클래스 : x,y
	int y = 20;
}
public class InheritEx01 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.x);
		System.out.println(sub.y);
		System.out.println(sub.toString());
		System.out.println(sub);
		
		System.out.println(Sub.a);
		System.out.println(Super.a);

	}

}
