package day08;

// #1 클래스 정의
class Tv {
	boolean power = false;
	int vol = 0, ch =1;
}

public class ClassEx03 {
	
	// 클래스변수
	// 인스턴스변수

	public static void main(String[] args) {
		
		// #2 객체 생성
		Tv t; // 선언 > 변수만 만든것
		t = new Tv(); //  생성 : 메모리가 Tv크기만크 생성되는 시점
		// Tv t = new Tv(); 선언 + 생성
		
		// #3 사용
		System.out.println(t.ch);
		System.out.println(t.power);
		System.out.println(t.vol);
		
		// #4 객체 여러개 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		Tv t4 = new Tv();
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		// 클래스명@객체고유번호(주소)
		
		// 객체는 각각 따로 데이터 저장
		t1.ch = 10;
		t2.ch = 20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		// 같은 타입끼리 대입 가능 Tv(사용자가 지정한 타입)
		int a =10;
		int b =20;
		
		// 가능
		t1 = t2;
		// 불가능
		// t1 = t2.ch; // Tv = int
		// 가능
		t1.ch = t2.ch;
		a = t2.ch;
		
		// ClassEx03도 클래스라서 객체생성 가능, 자기자신 생성가능
		ClassEx03 cls =  new ClassEx03();
		
		String s = new String ();
		
		int [] arr = new int[5];
		
		
		
		/*
		 * 이클립스 단축키
		 * 실행 : ctrl + F11
		 * 자동완성 : ctrl + spacebar
		 * 다음줄 빠져나가기 : shift + Enter
		 * 블럭선택 : ctrl+shift
		 * shift + end
		 */


		
		
	}

}
