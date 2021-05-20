package day16;
class Point {
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;	
}
@Override
public String toString() {
	
	//return getClass().getName() + "@" + Integer.toHexString(hashCode());
	//return "Piont toString() : " + getClass().getName();
	return "Point (" + x + y +")";
}

public class ApiEx02v {
	
}
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); //클래스이름
		System.out.println(obj.hashCode()); // 해쉬코드값
		System.out.println(obj.toString()); // 객체정보를 문자열로 출력
		System.out.println(obj);	// 객체 출력 > toString()
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,5);
		print(p);
		
	}
}
