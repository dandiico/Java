package day09;
// Tv 클래스
// 1. 변수 : 값저장 : 채널, 볼륨, 전원
// 2. 메서드 : 기능 : 전원 on/off, 볼륨 조정, 채널 조정, 채널입력

class Tv{
	// 인스턴스 변수 : 티비의 상태값 들고있는 변수들
	int ch = 1, vol =0;
	boolean power = false;
	
	// 메서드
	void powerOnOff() {
		// 전원 껐다 켜기
		power = !power; // 반전해서 덮어쓰기 // != 이건 비교연산
	}
	
	void volUp() {
		vol++;
	}
	
	void volDown() {
		vol--;
	}
	
	void chUp() {
		ch++;
	}
	
	void chDown() {
		ch--;
	}
	
	void chChange(int c) { // return 값이 없으니까 void
		ch = c;
	}
	
}
public class ClassEx09 {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		System.out.println("tv 하나 샀어~");
		System.out.println("power : " + tv.power);  // false
		
		// 전원키기
		tv.powerOnOff();
		System.out.println("power : " + tv.power); // true
		
		System.out.println("vol : " + tv.vol);
		tv.volUp();
		System.out.println("vol : " + tv.vol);
		tv.volUp();

		System.out.println("vol : " + tv.vol);
		
		System.out.println("ch : " + tv.ch);
		tv.chDown();
		System.out.println("ch : " + tv.ch);
		
		System.out.println("ch : " + tv.ch);
		tv.chChange(123);
		System.out.println("ch : " + tv.ch);
		
		
		
		

	}

}
