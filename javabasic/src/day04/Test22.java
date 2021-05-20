package day04;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1)
		// 점수 60점 이상이면 합격, 아니면 불합격 출력
		/* 정답
		int score = 70;
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		*/
		
		// 문제2)
		// 점수를 입력받고, 90점 이상이면 "수",
		// 80점 이상이면 "우", 70점 이상이면 "미"
		// 그 이하는 "재시험" 출력
		
		System.out.println("점수를 입력하시오 (100점 만점)");
		int input = Integer.parseInt(sc.nextLine());
		if(input > 100) { // 100보다 큰수입력했을때, 예외처리
			System.out.println("점수를 잘못 입력하셨습니다.");
		}else { // 100 이하로 입력했을때
			//점수 판별해서 출력
			if(input >= 90) {
				System.out.println("수");
			}else if(input >= 80) { // 위에서 부터 거르고 내려오기때문에 따로 90미만일 경우는 작성하지 않아도됨, 대신 순서대로
				System.out.println("우"); // 타이트하게 조건을 묶어도 됨, 간단히 하고싶으면 왼쪽에 적힌것 처럼
			}else if(input >= 70) {
				System.out.println("미");
			}else {;
				System.out.println("재시험");
			}
		}
		// 50 < a < 100 불가! 비교연산이 따로 쓰여야함, 한번에 처리 불가
		
		
		
		

		
		sc.close();
		} // 메인

} // 클래스
