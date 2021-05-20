package day04;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// switch로 문제 풀기 
		// 문제1 정수를 입력받아 3~5는 "봄", 6~8은 "여름",
		// 9~11은 "가을", 12~2는 "겨울 출력
		/*
		System.out.println("1~12까지의 정수를 입력하시오");
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default :
			System.out.println("알수 없는 숫자 입니다.");
		}
		*/

		
		// 문제2 성적을 입력받고, 90~100"수", 80~89"우", 70~79"미"
		// 60~69"양". 그 이하는 "가"출력
		/*
		System.out.println("성적을 입력하시오");
		int sco = Integer.parseInt(sc.nextLine());
		sco /= 10;
		switch(sco) {
		case 10:
			System.out.println("수");
			break;
		case 9:
			System.out.println("수");
			break;	
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default :
			System.out.println("가");
		}
		*/
		
		// 문제3 + - * / 중 원하는 기호를 선택하여 기호에 맞는 a,b의 연산결과를 출력하시오.
		int a = 10;
		int b = 0;
		
		System.out.println("+,-,*,/ 중 기호를 입력하시오");
		String op = sc.nextLine();
		switch(op) {
		case("+"): // 괄호 생략가능
			System.out.println(a + b);
			break;
		case("-"):
			System.out.println(a - b);
			break;
		case("*"):
			System.out.println(a * b);
			break;
		case("/"):
			// 예외처리, 프로그램 진행시 오류가 나는것을 미리 처리하는것
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
			System.out.println(a / b);
			}
		default:
			System.out.println("잘못 입력하였습니다");
		}
		
		
		
		
		// switch > if > 삼항연산자
		sc.close();
	}

}
