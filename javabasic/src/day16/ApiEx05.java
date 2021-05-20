package day16;
class Point1 {
	int x,y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) { // 두 객체의 x,y가 동일한지 비교하는식으로 재정의
		Point1 p = (Point1)obj; // Object 타입으로 받은 obj 값을 Point1로 다시 형변환해야지 x,y 에 접근가능
		if(x == p.x && y == p.y) {
		return true;
		} else{
			return false;
		}
	}
}
public class ApiEx05 {

	public static void main(String[] args) {
		
		Point1 a = new Point1(2,3);
		Point1 b = new Point1(2,3);
		Point1 c = new Point1(3,4);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
	}
}
