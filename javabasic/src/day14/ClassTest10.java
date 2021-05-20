package day14;
//상속문제
/*
	#1. 
	아래 main()메소드 #1번과 아래 실행결과를 참고하여 TVClass를 상속받은 
	ColorTV클래스를 작성하세요. 
	실행결과 : 32인치 1024컬러
	
	#2. 위 1번 문제를 푼후, main()메소드 #2번과 아래 실행결과를 참고하여 
	ColorTV를 상속받는  IPTV클래스를 작성하세요.
	실행결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
*/
class TVClass {
	private int size;
	public TVClass(int size) { this.size = size; }
	protected int getSize() { return size; } // 상속받은 클래스 or 같은 패키지
}
class ColorTV extends TVClass{
	private int color;	// color 담아줄 변수
	ColorTV(int size, int color){	// 매개변수 2개 받는 생성자
		super(size);	// 부모생성자 직역해서 호출, 이때 size를 필요로하고, size 초기화 공식도 부모생성자가 가지고 있음
		this.color = color;	// 내가 만든 변수이므로 내 생성자에서 초기화
	}
	int getColor() { return color; }
	void printProperty() { // 속성
		System.err.println(getSize() + "인치 " + color + "컬러"); 
		// size는 접근지정자가 private 바로 호출 불가능, getSize() 메소드로 값 불러오기
	}
}
class IPTV extends ColorTV{
	private String IPadress;
	
	IPTV(String IPadress, int size, int color){
		super(size, color);	// 부모생성자를 통해 size, color변수 초기화 됨
		this.IPadress = IPadress; // 내가 만든 IPadress 변수 초기화
	}
	@Override
	void printProperty() { // 부모가 가지고 있는 메소드의 구현부만 수정 -> 오버라이딩
		System.out.println("나의 IPTV는 " + IPadress + "주소의 " + getSize() +"인치 " + getColor() + "컬러");
	}
}

public class ClassTest10 {
	public static void main(String[] args) {
		//#1. 
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048);
		iptv.printProperty();
	}
}
