package day12;
import java.util.Scanner;
/*
콘서트 예약 프로그램. 
- 공연은 하루에 한번
- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다. 
- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다. 
- 예약은 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다.
- 조회는 모든 좌석을 출력한다.
- 취소는 예약자의 이름을 입력받아 취소한다.
- 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소등에 대해서
  오류 메세지를 출력하고 사용자가 다시 시도하도록 한다.
# 실행예시 #
자바콘서트홀 예약시스템입니다.
예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 1
S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
이름 >> 피카츄
번호 >> 1
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
이름 >> 꼬북이
번호 >> 5
<<예약완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 3
좌석구분 S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
이름 >> 꼬북이
<<취소완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<조회완료>>

예약:1, 조회:2, 취소:3, 끝내기:4 >> 4
<<프로그램 종료>>
*/
class Seat{
	Scanner sc = new Scanner(System.in);
	//좌석 객체 생성
	//좌석 정보 저장
	String [] seatS = new String[10];
	String [] seatA = new String[10];
	String [] seatB = new String[10];
	
	Seat() {
		for(int i = 0; i<seatS.length; i++) {
			seatS[i] = "___";
			seatA[i] = "___";
			seatB[i] = "___";
		}
	}
	void seatS() {
		System.out.print("S >> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatS[i] + " ");
		}
		System.out.println();
	}
	void seatA() {
		System.out.print("A >> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatA[i] + " ");
		}
		System.out.println();
	}
	void seatB() {
		System.out.print("B >> ");
		for(int i = 0; i<seatS.length; i++) {
			System.out.print(seatB[i] + " ");
		}
		System.out.println();
	}
	
}


class Booking {
	Scanner sc = new Scanner(System.in);
	Seat s = new Seat();
	
	void booking() {
		System.out.println("좌석구분 S(1), A(2), B(3) >>");
		int seatNum = Integer.parseInt(sc.nextLine());
		if(seatNum == 1) {
			s.seatS();
			System.out.println("이름 >>");
			String name = sc.nextLine();
			System.out.println("번호 >>");
			int num = Integer.parseInt(sc.nextLine());
			s.seatS[num-1] = name;
			System.out.println("예약완료");
		}else if(seatNum == 2) {
			s.seatA();
			System.out.println("이름 >>");
			String name = sc.nextLine();
			System.out.println("번호 >>");
			int num = Integer.parseInt(sc.nextLine());
			s.seatA[num-1] = name;
			System.out.println("예약완료");
		}else if(seatNum == 3) {
			s.seatB();
			System.out.println("이름 >>");
			String name = sc.nextLine();
			System.out.println("번호 >>");
			int num = Integer.parseInt(sc.nextLine());
			s.seatB[num-1] = name;
			System.out.println("예약완료");
		}
	}
	void cencel() {
		System.out.println("좌석구분 S(1), A(2), B(3) >> 2");
		int seatNum = Integer.parseInt(sc.nextLine());
		if(seatNum ==1) {
			s.seatS();
			System.out.println("이름 >> ");
			String name = sc.nextLine();
			for(int i= 0; i<s.seatS.length; i++) {
				if(name.equals(s.seatS[i])) {
					s.seatS[i] = "___";
					i = s.seatS.length;
				}
			}
			System.out.println("취소완료");
		}
		else if(seatNum ==2) {
			s.seatA();
			System.out.println("이름 >> ");
			String name = sc.nextLine();
			for(int i= 0; i<s.seatA.length; i++) {
				if(name.equals(s.seatA[i])) {
					s.seatA[i] = "___";
					i = s.seatS.length;
				}
			}
			System.out.println("취소완료");
		}
		else if(seatNum ==3) {
			s.seatB();
			System.out.println("이름 >> ");
			String name = sc.nextLine();
			for(int i= 0; i<s.seatB.length; i++) {
				if(name.equals(s.seatB[i])){
					s.seatB[i] = "___";
					i = s.seatB.length;
				}
			}
			System.out.println("취소완료");
		}
	}
	void view() {
		s.seatS();
		s.seatA();
		s.seatB();
	}
	void end() {
		System.out.println("<<프로그램 종료>>");
	}
	
	void run() {
		boolean play = true;
		System.out.println("자바콘서트홀 예약시스템입니다.");
		
		while(play) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 1) { 
				booking();
			}else if(num == 2) {
				view();
			}else if(num == 3) {
				cencel();
			}else if(num == 4 ) {
				end();
				play = !play;
			}else {
				System.out.println("잘못입력 하셨습니다. 다시 선택해주세요");
			}
		
		}
		
	}
	
}

public class ClassTest07 {
	public static void main(String[] args) {
		Booking b = new Booking();
		b.run();
	}
}
