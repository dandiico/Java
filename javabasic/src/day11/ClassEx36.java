package day11;

public class ClassEx36 {
	
	int x = 10;
	
	void setX(int x) { // 메서드 안에서의 우선순위 : 지역 > 인스턴스 > 클래스
		this.x = x;	// this == 인스턴스를 가르키는 대명사 == 객체 // c.x = x
	}

	public static void main(String[] args) {
		
		ClassEx36 c = new ClassEx36();
		int x = 100;
		System.out.println(x); // 지역변수
		System.out.println(c.x); // 인스턴스변수
		c.setX(200);
		System.out.println(c.x);
	}

}
