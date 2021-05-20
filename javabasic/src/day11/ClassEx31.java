package day11;
// 인스턴스 초기화 블럭
class Product{
	static int count = 0; // 객체가 몇개 생성되었는지 개수 저장할 변수
	String serialNo;		// 객체 고유 번호
	{
		++count; System.out.println("count 증가");
		serialNo = "P000" + count;
	}
}

public class ClassEx31 {

	public static void main(String[] args) {

		Product p1 = new Product(); // new 객체 생성되어 인스턴스 초기화 블럭이 실행됨
		Product p2 = new Product();
		Product p3 = new Product();
		System.out.println("생산된 제품의 수 : " + Product.count);
		System.out.println("p1 : " + p1.serialNo);
		System.out.println("p2 : " + p2.serialNo);
		System.out.println("p3 : " + p3.serialNo);
	}

}
