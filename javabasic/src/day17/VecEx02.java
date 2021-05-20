package day17;
import java.util.Vector;
class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
}

public class VecEx02 {
	public static void main(String[] args) {
		// Point 객체만 저장할 벡터를 생성
		Vector<Point> point = new Vector<Point>();
		
		// 요소 삽입
		point.add(new Point(2,3));
		point.add(new Point(10,30));
		point.add(new Point(-100,1000));
		
		System.out.println(point);
		
		/*
		// Vector 안의 point 객체 모두 검색
		for(int i = 0; i<point.size(); i++) {
			Point p = point.get(i);
			System.out.println(p);
		}
		*/
		printVector(point); // 매개변수로 point 던져서 메소드 호출
	}
	
	public static void printVector(Vector<Point> point) { // Vector<Point> 타입의 매개변수로 받기 때문에 타입 똑같이 적어주면 됨
		for(int i = 0; i<point.size(); i++) {
			Point p = point.get(i);
			System.out.println(p);
		}
	}
}
