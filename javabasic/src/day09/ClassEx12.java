package day09;

class Radio{
	
	int vol; // 인스턴스 변수
	static boolean power; // 클래스 변수
	int ch; // 인스턴스 변수
	
	void volUp() { // 인스턴스 메서드 (입력값,출력값 없음)
		vol++;
	}
	
}
public class ClassEx12 {

	public static void main(String[] args) {
	
		Radio radio = new Radio();
		System.out.println(radio.ch);
		

	}

}
