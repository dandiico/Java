package day08;
import java.util.Scanner;
public class ArrEx11 {
	/*
		문제 : Up & Down 게임
		0 ~ 99 사이의 임의의 수를 받아 숨기고, 그 수를 맞추는 게임 
		임의의 수보다 낮게 입력하면 "Up" 출력, 
		높게 입력하면 "Down" 출력하면서 범위를 좁혀가며 수를 맞춘다. 
		게임을 반복하기 위해서  y/n묻고, n인 경우 프로그램 종료. 
		콘솔예)
		숫자가 정해졌습니다. 맞춰보세요!!
		0 ~ 99
		1 >>  55 (<-- 사용자 입력) 
		"Up"
		55 ~ 99
		2 >> 70
		"Up"
		70 ~ 99 
		3 >> 85
		"Down"
		70 ~ 85
		4 >> 75
		"Up"
		75 ~ 85
		5 >> 82
		맞았습니다.
		다시하시겠습니까?(y/n) >>  y
		숫자가 정해졌습니다. 맞춰보세요!
		0 ~ 99
		1 >> 30
		"Up"
		30 ~ 99
		2 >> 45
		맞았습니다. 
		다시하시겠습니까?(y/n) >> n
		게임종료!!
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean play = true; // 게임 진행중인지 상태 가지고 있음
		while(play) {
			// 랜덤값 뽑기
			int num = (int)(Math.random()*10);
			int guess = -1; // 입력받을 변수
			int count = 1; // 시도하는 횟수 저장할 변수
			int max = 99; // 최대 범위
			int min = 0; // 최소 범위
			// 게임시작 메세지 출력
			System.out.println("숫자가 정해졌습니다. 맞춰보세요!");
			while(true) {
				// 범위 출력
				System.out.println(min + "~" + max);
				// 입력받기
				System.out.println(count + " >> ");
				guess = Integer.parseInt(sc.nextLine());
				
				count++;
				// 검사해서 결과 알려주고
				if(guess == num) { // 숫자 맞췄을때
					System.out.println("맞췄습니다");
					System.out.println("다시하시겠습니까?(y/n) >>");
					String answer = sc.nextLine();
					if(answer.equalsIgnoreCase("n")) { // 대소문자 구별 없어짐
						System.out.println("프로그램 종료");
						play = false;
						break; // 내부 while문 종료
					}else if(answer.equalsIgnoreCase("y")) {
						System.out.println("프로그램 종료");
						play = true;
						break; // 내부 while문 종료
					}else {
						System.out.println("잘못입력");
						continue;
					}
				}
				// 못맞췄을때 처리
				
				if(guess < num) { // 낮게 입력했을때
					System.out.println("up");
					min = guess; // 범위값 수정
				}
				if(guess > num) { // 높게 입력했을때
					System.out.println("down");
					max = guess; // 범위값 수정
				}
								
			
			} // 내부 while
		} // 외부 while
		
		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}
}
