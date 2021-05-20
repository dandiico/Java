package day09;

class Test3{
	// 메서드 4개 종류
	// 입력값 x, 리턴값 x
	void test() { // 인스턴스메서드 : 객체생성 > 참조변수명.메서드명()
		System.out.println("hello");
	}
	// 입력값 o, 리턴값 x
	void printName(String name) {
	System.out.println("안녕하세요," + name + "님!");
	}
	
	// 입력값 x, 리턴값 o
	int getHundred() {
		System.out.println("100 리턴해줄게");
		return 100;
	}
	
	// 입력값 o, 리턴값 o
	int sum(int a, int b) {
		int res = a+b;
		return res;
	}
	
}
public class ClassEx10 {

	public static void main(String[] args) {
		
		Test3 t = new Test3(); // 객체생성
		t.test();
		t.printName("유지은");
		t.printName("피카츄");
		int result = t.getHundred();
		System.out.println(result);
		result = t.sum(100, 200);
		System.out.println(result);
		System.out.println(t.sum(100, 200));
		
		
		

	}

}
