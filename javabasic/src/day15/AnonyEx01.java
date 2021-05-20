package day15;
interface MyInter{
	void func(); // 추상메소드 public abstract 키워드 생략
}
public class AnonyEx01 {

	public static void main(String[] args) {

		// 인터페이스 -> 구현한 클래스 정의(오버라이딩) 
		// 			-> 구현클래스 객체 생성해서 오버라이딩 된 메소드 호출 사용
		// 단발성으로 정의해서 호출하여 사용
		new MyInter() { // 객체 생성
			@Override // 정의
			public void func() {
				System.out.println("MyInter 의 func() 오버라이딩된 메소드 호출");
			}
		}.func(); // 호출하여 사용
	
		
		
		
		
	}

}
