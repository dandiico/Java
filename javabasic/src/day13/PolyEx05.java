package day13;
// 오버라이딩 다형성 실현 > 링크드 리스트 구현

class Shape{ // next, draw
	public Shape next;
	public Shape() {next = null;}
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape{ // next, @draw()
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{ // next, @draw()
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{ // next, @draw()
	@Override
	public void draw() {
		System.out.println("Circe");
	}
}

public class PolyEx05 {
	/*
	static void paint(Shape s) {
		s.draw();
	}
	*/
	
	public static void main(String[] args) {
		/*
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		 */
		
		// 시작과 동시에 마지막도 된다
		Shape start, obj, last;
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		obj = new Line(); // obj tmp처럼 잠깐 넣어 놓는것
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		// 모든 도형 출력
		Shape s = start; // start는 훼손되면 안됨
		while(s != null) { // next가 마지막이 되면 null이 되어 있을것임
			s.draw();
			s = s.next;
			
		}
	}

}
