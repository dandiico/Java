package note;
import java.util.Scanner;
class Tv {
	boolean power = false;
	int [] channel = new int[10];
	int chIdx = 0;
	int vol = 0;
	
	// 전원
	void powerOnOff() {
		power = !power;
	}
	
	// 채널 세팅 메서드 정의
	void setChannel() {
		if(power) {
		for(int i = 0; i<channel.length; i++) {
			channel[i] = (int)(Math.random() *100) +1; // 1~100 랜덤
			// 중복체크
			for(int j = 0; j<i; j++) {
				if(channel[i] == channel[j]) {
					i--;
					break; // 중복체크(내부) for문 종료
				}
			}
		}
		// 정렬(오름차순) 선택정렬(가장 낮은것 찾아서 앞으로 이동)
		int min = 0; // 낮은값의 인덱스번호를 가지고 있을 변수 초기값 0번 인덱스
		for(int i=0; i<channel.length; i++) {
			min = i;
			for(int j = 0; j<channel.length; j++) {
				if(channel[min] > channel[j]) {
					min = j;
				}
				int tmp = channel[i];
				channel[i] = channel[min];
				channel[min] = tmp;
			}
		} //i for문
		
		}// if(power)
	}// 메서드 종료
	void printCh() { // 채널 출력하는 메서드
		if(power) {
			System.out.println("ch >>");
			for(int c : channel) System.out.print(c+" ");
			System.out.println();
		}
	}
		
	void setTv() { // 티비 처음 세팅하는 메서드 정의
		if(power) { // 전원이 켜있으면 동작
			System.out.println("전원 : " + (power ? "ON" : "OFF"));
			setChannel(); // 채널 세팅 메세드 호출
			printCh(); // 채널 출력 메서드 호출
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
		
	// 채널 up
	void chUp() {
		chIdx++;
		if(chIdx == 10) chIdx = 0; // 명령 하나면 중괄호 삭제 가능
		System.out.println("채널 up:"+ channel[chIdx]);
	}
	
	void chdown() {
		chIdx--; 
		if(chIdx == -1) chIdx = 9;
		System.out.println("채널 down:"+ channel[chIdx]);
	}
	
	// 채널 번호입력해서 변경하기
	void chChange(int c) {
		if(power) {
			for(int i =0; i<channel.length; i++) {
				if(channel[i] == c) {
					chIdx = i; // 해당채널로 변경
					System.out.println("채널 변경:"+ channel[chIdx]);
					break;
				}
			}
		}
	}
	
	// 볼륨 조정 (0~ 10)
	void volUp() {
		if(power) {
			if(vol < 10) vol++;
			System.out.println("볼륨 up :" + vol);
		}
	}
	void volDown() {
		if(power) {
			if(vol>0) vol--;
			System.out.println("볼륨 down :" + vol);
		}
	}
	
	// 음소거
	void mute() {
		vol = 0;
	}
	/* Tv 정보 출력
	void tvInfo() {
		System.out.println("*****Tv정보*****");
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		printCh();
		System.out.println("채널 :"+ channel[chIdx]+ "볼륨 :" + vol);
	}
	*/
	String tvInfo() {
		System.out.println("*****Tv정보*****");
		printCh();
		String str = "전원 : " + (power ? "ON" : "OFF");
		str += "채널 :"+ channel[chIdx]+ "볼륨 :" + vol;
		return str;
	}


}

public class Note {

	public static void main(String[] args) {

		Tv tv = new Tv(); // tv구매
		tv.powerOnOff(); // 전원켜기
		tv.setTv(); // 채널세팅
		/*
		tv.chChange(20);
		tv.tvInfo();
		System.out.println(tv.tvInfo()); // 전원, 채널, 볼륨 리턴받아 여기서 출력
		*/
		
		tv.printCh();
		
	
		
		
		
		
	}

}
