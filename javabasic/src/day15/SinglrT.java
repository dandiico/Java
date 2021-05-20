package day15;
class SingleT {
	
	//싱글톤으로 만들기
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance() { return instance;}
	// 일반 인스턴스 변수
	int a = 100;

	// 일반 인스턴스 메소드 : 객체 생성후 사용가능
	void func() {
		System.out.println("싱글톤");
	}
}
public class SinglrT {

	public static void main(String[] args) {
		//SingleT s = new SingleT(); // 외부에서 객체생성 불가!!
		//SingleT.instance;
		SingleT s = SingleT.getInstance(); // 객체 한개 생성된거 얻어다 사용
		SingleT s1 = SingleT.getInstance();
	
		System.out.println("s.a : " + s.a);
		System.out.println("s1.a : " + s1.a);
		s.a = 200;
		System.out.println("s.a : " + s.a);
		System.out.println("s1.a : " + s1.a);
		System.out.println(s);
		System.out.println(s1);
	}

}
