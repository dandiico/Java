package day05;
import java.util.Scanner;
public class Test34 {

	public static void main(String[] args) {
		
		//for문으로 풀이
		// Q1 10~30까지 출력
		/*
		for(int i = 10; i <=30; i++) {
			System.out.println(i);
		}
		*/
		
		// Q2 0~100까지 10단위로 출력 0 10 20 30...
		/*
		for(int i =0; i <= 100; i+=10) {
			System.out.println(i);
		}
		*/
		
		// Q3 1~20까지의 짝수만 출력
		/*
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
		*/
		
		// Q4 1~100까지의 홀수의 합 출력
		/*
		int total = 0;
		for(int i =1; i <= 100; i++) { // 1~100 반복 돌리기
			if(i % 2 == 1) { // 홀수만 검사 찾기 > if %2
				total += i; // 홀수일때만 누적시키기 > total변수
			}
		}
		System.out.println("홀수의 합 : " + total);
		
		*/
		
		// Q5 정수 한개를 입력받고, 1부터 입력받은 수까지의 총합 출력
		// 정수 하나 입력받아 저장
		// 1부터 입력받은 수까지 > 1부터 반복 > 입력받은 수까지로 범위가 매번변경
		// 범위지정 > 조건식
		// 총합 > 누적 더하기 > total 변수 필요
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = Integer.parseInt(sc.nextLine());
		// = sc.nextLine();
		int total = 0;
		for(int i=1; i <= num; i++) {
			total += i;
			System.out.println(i);
		}
		System.out.println("총합 : " + total);
		
		
		sc.close();
	}

}
