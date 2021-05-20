package day14;
//상속, 생성자
/*
	Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하세요. 
	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
	실행결과:
		RED색의 (10,20)의 점입니다.
*/
class Point {
	private int x, y; // 인스턴스변수
	public Point(int x, int y) { this.x = x; this.y = y; } // 매개변수 두개를 받는 생성자
	public int getX() { return x; } // int 타입의 메소드 : 리턴 x
	public int getY() { return y; } // int 타입의 메소드 : 리턴 y
	protected void move(int x, int y) { this.x = x; this.y = y; } // 같은클래스&자식클래스 접근 가능 메소드 return 없음
}
class ColorPoint extends Point{
	private String color;
	ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	void setXY(int x, int y){
		move(x,y);
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() { // Object가 가지고 있는것
		return color +"색의 ("+ getX() + "," + getY() + ")의 점";
	}
}
public class ClassTest12 {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
		
		
	}
}
