package day11;

class Circle{
	// 인스턴스 변수
	int radius;
	
	Circle(){} // 초기화 없이, 매개변수 없이 객체생성도 가능하게 하려면
	// 매개변수없는 생성자도 작성을 해줘야한다.
	// 생성자
	Circle(int radius){
		this.radius = radius;
	}
	// 메서드
	void set(int radius) {
		this.radius = radius;
	}
	double getArea() {	// 지역변수/매개변수로 동일한 이름이 없으니 그냥 radius만 사용해도
						// 인스턴스로 인지함
		return radius * radius * 3.14;
	}
	
}

public class ClassEx35 {
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10);
		pizza.set(15);
		System.out.println(pizza.getArea());
		Circle c = new Circle(20);
		System.out.println(c.getArea());
	
	}
}
