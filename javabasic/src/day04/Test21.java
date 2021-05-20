package day04;

public class Test21 {

	public static void main(String[] args) {
		
		// 중괄호 안에는 들여쓰기
		int a = 20;
		if(a < 10) {
			System.out.println("10보다 크다");
		} // false는 건너띔
		
		if(a-10 >= 10) {
			System.out.println("출력??");
		}
		
		int score = 100;
		// 문제. 점수가 60점 이상이면 "합격", 아니면 "불합격" 출력
		if(score >=60) {
			System.out.println("합격");
		}
		if(score < 60) {
		System.out.println("불합격");
		}
		
		
	}

}
