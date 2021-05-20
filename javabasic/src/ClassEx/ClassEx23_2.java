package ClassEx;
/*
 * Tv 클래스 기능 구현
 * 1. 채널 = 배열[10] 생성후, 랜덤값 10개 생성해 낮은값부터 대입
 * 2. 채널(up,down) = 위 랜덤뽑힌 채널 번호로 이동, 인덱스 번호로 이동
 * 3. 채널값을 입력받아 변경 (입력값이 채널 배열에 없는 번호면 이동 못함)
 * 4. 볼륨은 0~10까지 증감
 * 5. 볼륨 음소거 기능
 * 6. Tv 정보 출력 - 메서드 호출되면 Tv상태(전원, 채널, 볼륨 값 출력)
 * 7. 전원이 꺼져있는 경우 모든 기능 동작 안함
 */
class Tv{
	static boolean power = false; // 클래스변수 power 선언과 함께 flase로 값 초기화
	int ch[] = new int[10]; // 채널 넣어놓을 배열 만듬
	int chIndex = 0; // 채널인덱스 번호 넣어놓을 변수 만듬
	int vol = 0; // vol 넣어놓을 변수 만듬


	void powewOnOff() { // 전원 끄고,키는 메소드 선언
		power = !power;
	}
	
	void setCh() {	// 채널세팅할 메소드 선언
		// 랜덤값 10개 생성하여 ch배열에 넣기
		for(int i = 0; i<ch.length; i++) {
			ch[i] = (int)(Math.random()*100)+1;
			for(int j = 1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					i--; // 중복일시 i번째 다시 뽑아야 하니까 -1 감소해주기
					break; // 내부 for문 빠져나가기
				}
			}
		}
		
		// 채널 배열에 넣어준 값 오름차순 해주기
		for(int i = 0; i<ch.length-1; i++) {
			for(int j = 1; j<ch.length; j++) {
				if(ch[i] > ch[j]) { // 앞에 있는 인덱스 번호의 값이 뒤에 인덱스 번호 보다 작을시 값 바꿔주기
					int tmp = ch[j];
					ch[j] = ch[i];
					ch[i] = tmp;
				}
			}
		}
	}
	
	void printCh() {
		for(int i = 0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
	
	void printC() { // 채널 출력하는 메서드
		if(power) {
			System.out.println("ch >>");
			for(int c : ch) System.out.print(c+" ");
			System.out.println();
		}
	}






}
public class ClassEx23_2 {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.powewOnOff();
		System.out.println(tv.power);
		tv.setCh(); // 채널 세팅
		tv.printCh();
		tv.printC();
		
		
		
		
		
		
		
		
	}
}
