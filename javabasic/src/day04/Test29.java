package day04;

import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while문 문제
		// 문제1 0~10까지 출력
		/*
		int n = 0;
		while(n<11) {
			System.out.println(n);
			n++;
		}
		*/
		
		// 문제2 1~15까지 출력
		/*
		int n = 1;
		while(n<16) {
			System.out.println(n);
			n++;
		}
		*/
		
		// 문제3 0~100까지의 10단위로 출력. 0 10 20...
		/*
		int n = 0;
		while(n<101) {
			if(n % 10 == 0) {
				System.out.println(n);
			}
			n++;
		}
		*//* 풀이2.
		int a= 0;
		while(a <= 100) {
			System.out.println(a);
			a+=10;
		*/
		
		// 문제4 1~20까지의 홀수만 출력
		/*
		int n = 1;
		while(n<21) {
			if(n % 2 == 1) {
				System.out.println(n);
			}
			n++;
		}
		*/
		
		// 문제5 1~10까지의 총 합 출력
		/*
		int n = 1;
		int resalt = 0;
		while(n<11) {
			resalt += n;
			n++;
		}
		System.out.println(resalt);
		*/
		/*
		// 문제6 1~50까지의 짝수의 총 합 출력
		int a = 1;
		int total = 0;
		
		while(a <= 50) {
			if(a % 2 == 0) {
				total += a;
			}
			a++;
		}
		System.out.println("짝수의 총 합 : " + total);
		*/
		
		// 문제7 주문 프로그램
		/*
		 *** 글로벌 카페 메뉴 ***
		 1. 아메리카노 : 2500원
		 2. 카페라떼   : 3000원
		 3. 카푸치노   : 3500원
		 4. 카라멜 프라푸치노 : 4000원
		 5. 햄치즈샌드위치 : 6000원
		 6. 종료
		 
		 1단계 : 위 메뉴를 콘솔에 출력하고, 종료(6)를 선택할때 까지 반복해서
		 	메뉴 번호로 주문을 받고, 종료 선택 후 주문 금액 출력
		 2단계 : int money = 20000; 내돈에서 주문시 주문금액 차감
		 	돈이 부족하면 주문 추가 불가, 종료시 총액 출력, 잔액도 출력
		 	/* 1단계 풀이
		 */
		
		// 메뉴 콘솔에 출력
		System.out.println("*** 글로벌 카페 메뉴 ***");
		System.out.println("1. 아메리카노 : 2500원");
		System.out.println("2. 카페라떼   : 3000원");
		System.out.println("3. 카푸치노   : 3500원");
		System.out.println("4. 카라멜 프라푸치노 : 4000원");
		System.out.println("5. 햄치즈샌드위치 : 6000원");
		System.out.println("6. 종료");
		/* 풀이1
		// 메뉴번호로 주문 받기
		System.out.println("주문할 메뉴의 번호를 입력하세요");
		int menu = Integer.parseInt(sc.nextLine());
		
		
		// 총주문금액 변수 생성하여 0으로 초기화
		int total = 0;
		
		while(menu != 6) { // 6(종료) 선택 할때까지 반복, 입력받은 메뉴번호가 6이 아닐시 무한반복
			
			switch(menu) {
			case 1:
				total += 2500;
				break;
			case 2:
				total += 3000;
				break;
			case 3:
				total += 3500;
				break;
			case 4:
				total += 4000;
				break;
			case 5:
				total += 6000;
				break;
			}
			menu = Integer.parseInt(sc.nextLine());
		}
		System.out.println("총 주문 금액 : " + total);
		*/
		/*
		// 풀이2
		// 반복의 횟수가 정해지지 않았다.
		int total = 0; // 총합변수 미리 선언 : 메뉴 주문시 각 가격 누적해서 더할 변수
		while(true) {
			System.out.println("메뉴 번호를 선택하세요"); // 메세지 띄우기
			int num = Integer.parseInt(sc.nextLine()); // 메뉴 번호 입력받기
			// 입력받은 메뉴번호 몇번인지 확인해서, 각 번호에 따른 처리하기
			if(num == 1) { // 1번 선택할시
				total += 2500;
			}else if(num == 2) { // 2번 선택할시
				total += 3000;
			}else if(num == 3) {
				total += 3500;
			}else if(num == 4) {
				total += 4000;
			}else if(num == 5) {
				total += 6000;
			}else if(num == 6) {
				System.out.println("주문 종료 되었습니다");
				break; // while문 빠져나감, if는 break 안먹힘
			}else { // 1~6번이 아닌 다른 번호 잘못 눌렀을때 예외처리
				System.out.println("유효한 메뉴번호가 아닙니다. 다시 시도해주세요");
			}
			
		} // while 닫힘
		System.out.println("총 주문 금액 : " + total);
		*/
		
		/* 2단계 풀이
		 * 2단계 : int money = 20000; 내돈에서 주문시 주문금액 차감
		 	돈이 부족하면 주문 추가 불가, 종료시 총액 출력, 잔액도 출력 
		 */
		
		// 메뉴 콘솔에 출력
		System.out.println("*** 글로벌 카페 메뉴 ***");
		System.out.println("1. 아메리카노 : 2500원");
		System.out.println("2. 카페라떼   : 3000원");
		System.out.println("3. 카푸치노   : 3500원");
		System.out.println("4. 카라멜 프라푸치노 : 4000원");
		System.out.println("5. 햄치즈샌드위치 : 6000원");
		System.out.println("6. 종료");
		// 메뉴번호로 주문 받기
		// 총주문금액 변수 생성하여 0으로 초기화
		int total = 0;
		int money = 20000;

		while(true) {
			System.out.println("메뉴 번호를 선택하세요"); // 메세지 띄우기
			int num = Integer.parseInt(sc.nextLine()); // 메뉴 번호 입력받기
			// 입력받은 메뉴번호 몇번인지 확인해서, 각 번호에 따른 처리하기
		    if(num==1){ // 1번 선택할시
		    	if(money < 2500) {
		    		System.out.println("잔액부족으로 주문불가");
		    		break;
		    	}
		    	System.out.println("아메리카노");
		    	total += 2500; // 1번메뉴 가격 총합에 더해서 넣기
		    	money -= 2500;
		    }else if(num==2){ // 2번 선택할시
		    	if(money < 3000) {
					System.out.println("잔액부족으로 주문불가");
					break;
		    	}
		    	System.out.println("카페라떼");
		    	total += 3000;
		        money -= 3000;
		    }else if(num==3){ // 3번 선택할시
		   		 if(money < 3500) {
					System.out.println("잔액부족으로 주문불가");
					break;
		   		 }
		   		System.out.println("카푸치노");
		    	total += 3500;
		    	money -= 3500;
		    }else if(num==4){ // 4번 선택할시
		    	if(money < 4000) {
					System.out.println("잔액부족으로 주문불가");
					break;
		    	}
		   		System.out.println("카라멜 프라푸치노");
		    	total += 4000;
		    	money -= 4000;
		    }else if(num==5){ // 5번 선택할시
		    	if(money < 4000) {
					System.out.println("잔액부족으로 주문불가");
					break;
		    	}
		   		System.out.println("햄치즈샌드위치");
		    	total += 6000;
		    	money -= 6000;
		    }else if(num==6){ // 6번 선택할시
		   		System.out.println("주문종료");
		        break; // 주문하기 빠져나감, 종료시점, if문은 break에 안먹힘 해당사항없음
		    }else{ // 1~6번이 아닌 다른 번호 잘못 눌렀을때 예외처리
		    	System.out.println("주문번호를 잘못입력하셧습니다. 다시 시도해주세요");
		    }
		}
		
		System.out.println("총 주문 금액 : " + total);
		System.out.println("남은 잔액 : " + money);
		
		// 문제8 -1이 입력될때까지 정수를 계속 입력받고,
		// -1 입력시, 총합과 평균을 출력하는 프로그램
		/*
		// 풀이1
		System.out.println("정수를 입력하시오, 단 -1 입력시 프로그램 종료");
		int input = Integer.parseInt(sc.nextLine());
		int count = 1;
		int total = 0;
		double avg = 0;
		while(input != -1) {
			total += input;
			avg = total / (double)count;
			count++;
			input = Integer.parseInt(sc.nextLine());
		}
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		*/
		/*
		int count = 1; // 몇번 입력했는지 count 변수
		int total = 0; // 총합
		double avg = 0; // 평균
		while(true) {
			System.out.println("정수 입력 >>");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			if(num == -1) { // -1인지 체크해서 : 종료시점
				System.out.println("종료");
				break; // while문 종료
			}
			total += num;
			avg = total / (double)count;
			count++;
		}
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		*/
		/*
		 * if(count == 0) {
		 * System.out.println("숫자 입력이 안되어 평균을 구할수 없습니다.")
		 * } else {
		 * System.out.println("평균 : " + total / (double)count;);
		 * }
		 */
		
		
		
		// 문제9 문자열을 계속 입력받고 출력하되,
		// "exit"를 입력받으면 종료되는 프로그램
		// hint! 문자열 비교는 == 불가, String의 기능중 equals() 사용
		// String str = "abc";
		// System.out.println("str.equals("abc")) > true 출력
		/*
		while(true) {
			System.out.println("문자열을 입력하시오. 단, exit 입력시 프로그램 종료");
			String str = sc.nextLine();
			System.out.println(str);
			if(str.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		*/
		
		sc.close();
	}

}
