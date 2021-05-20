package day10;
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

import ClassEx.Tv;

class Tv{
	static boolean power = false;
	int [] ch = new int[10]; // 채널들 저장할 저장소
	int chIdx = 0; // 채널 배열 가르킬 인덱스 변수
	int vol = 0;
	
	static void chrandom() {
		// 1. 채널 = 배열[10] 생성후, 랜덤값 10개 생성해 낮은값부터 대입
		int []ch = new int[10]; // 채널 번호 10개 낮은값부터 대입할 배열
		int []random = new int[10]; // 랜덤값 10개 생성한거 넣어놓을 배열
		// 랜덤값 10개 뽑아서 랜덤 배열에 넣기
		for(int i = 0; i<random.length; i++) {
			random[i] = (int)(Math.random()*500)+1;
		}
		// 랜덤 배열에 낮은것부터 재정렬
		
		for(int i =0; i<random.length; i++) {
			for(int j = 0; j<random.length; j++) {
				if(random[i]<random[j]) {
					int tmp = random[j];
					random[j] = random[i];
					random[i] = tmp;
				}
			}
		}
		// 뽑은 랜덤값 채널 배열에 넣기
		for(int i = 0; i<ch.length; i++) {
			ch[i] = random[i];
		}
		
		for(int i = 0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	} // chrandom close
	
	//채널(up,down) = 위 랜덤뽑힌 채널 번호로 이동, 인덱스 번호로 이동
	void chUp(int[] arr) {
		int i = 0;
		arr[i+1];
	}
	
	 // 4. 볼륨은 0~10까지 증감
	void volUP() {
		if(vol == 10) {
			return;
		}else {
			vol++;
			
		}
	}
	
	void voldown() {
		if(vol == 0) {
			System.out.println("최소 볼룜입니다. 더이상 볼륨을 낮출 수 없습니다.");
			return;
		}else {
			vol--;
			
		}
	}
	// 5. 볼륨 음소거 기능
	void volMute() {
		vol = 0;
	}
	
	 // 6. Tv 정보 출력 - 메서드 호출되면 Tv상태(전원, 채널, 볼륨 값 출력)
	void tvInfo() {
		System.out.println("현재 전원 : " + power);
		System.out.println("현재 채널 : " + ch);
		System.out.println("현재 볼륨 : " + vol);
	}
	
	 // 7. 전원이 꺼져있는 경우 모든 기능 동작 안함
	void tvOff() {
		if(Tv.power == false) {
			
		}
	}
	
	
}

public class ClassEx23 {

	public static void main(String[] args) {
		
		
		Tv tv = new Tv();
		tv.chrandom();
		System.out.println(tv.vol);
		tv.volUP();
		tv.volUP();
		System.out.println(tv.vol);
		tv.volMute();
		System.out.println(tv.vol);
		tv.tvInfo();
		
		
		
		
		

		
	}

}
