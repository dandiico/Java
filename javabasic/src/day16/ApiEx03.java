package day16;
class Eq{
	int x,y;
	public Eq(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ApiEx03 {

	public static void main(String[] args) {
		
		Eq e1 = new Eq(1,3);
		Eq e2 = new Eq(1,3);
		System.out.println(e1);
		System.out.println(e2);
		Eq e3 = e1;
		if(e1 == e2) { // 주소 비교 false
			System.out.println("e1 == e2");
		}
		
		if(e1 == e3) {
			System.out.println("e1 == e3");
		}
		
		if(e1.equals(e2)) {
			System.out.println("e1 equalse e2");
		}
		if(e1.equals(e3)) {
			System.out.println("e1 equalse e3");
		}
		
		System.out.println("종료");
	}

}
