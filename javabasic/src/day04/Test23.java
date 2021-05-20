package day04;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1) 정수 두개를 입력받고, 몫과 나머지를 출력하세요.
		/*
		System.out.println("정수1을 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수2를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		int resalt = num1 / num2;
		int resalt2 = num1 % num2;
		System.out.println("두수를 나눈 몫 : " + resalt);
		System.out.println("두수를 나눈 나머지 : " + resalt2);
		*/
			
		
		// 문제2) 일수(day)를 입력받고, 몇개월 몇일 인지 출력하세요.
		// 		단, 한달은 30일로 고정
		/*
		System.out.println("일수를 입력하세요, 단 한달은 30일로 고정");
		int input = Integer.parseInt(sc.nextLine());
		int month = input / 30;
		int day = input % 30;
		System.out.println(month + "개월 " + day + "일");
		*/
		
		// 문제3) 점수 3개를 입력받고, 총점과 평균을 구하여 출력하세요
		/*
		System.out.println(점수1을 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("점수2를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("점수2을 입력하세요");
		int num3 = Integer.parseInt(sc.nextLine());
		int score = num1+num2+num3;
		double average = score / 3.0; // int 나누기 double은 double
		System.out.println("점수 총합 : " + score);
		System.out.println("점수 평균 : " + average);
		*/
		
		// 문제4) 숫자 하나를 입력받고, "음수"인지 "양수"인지 출력해보세요.
		/*
		System.out.println("정수를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		if(num > 0) {
			System.out.println("양수");
		}else if(num <0) {
			System.out.println("음수");
		}else {
		System.out.println("0 입니다");
		}
		*/
		
		
		// 문제5) 1~99 사이 숫자를 입력받고, "짝수"인지 "홀수"인지 출력
		/*
		System.out.println("1~99 사이의 숫자를 입력하시오");
		int num = Integer.parseInt(sc.nextLine());
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else if(num % 2 == 1) {
			System.out.println("홀수");
		}
		*/
		
		// 문제6) 서로 다른 정수 3개를 입력받고, 3개의 숫자중 중간 크기의 수를 출력/**/
		//		(평균값x)
		// 풀이1
		/*
		System.out.println("정수1을 입력하시오");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수2를 입력하시오");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("정수3을 입력하시오");
		int num3 = Integer.parseInt(sc.nextLine());
		if((num1>num2 && num1<num3) || (num1<num2 && num1>num3)) {
			System.out.println(num1);
		}else if((num2>num1 && num2<num3) || (num2<num1 && num2>num3)) {
			System.out.println(num2);
		}else if((num3>num1 && num3<num2) || (num3<num1 && num3>num2)) {
			System.out.println(num3);
		}
		*/
		
		// 풀이2
		/*
		System.out.println("정수1을 입력하시오");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("정수2를 입력하시오");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("정수3을 입력하시오");
		int c = Integer.parseInt(sc.nextLine());
		if(a < b) {
			if(a > c) {
				System.out.println("a : " + a);
			}else {
				if(b < c) {
					System.out.println("b : " + b);
				}else {
					System.out.println("c : " + c);
				}
			}
		}else { // a > b
			if(b > c) {
				System.out.println("b : " + b);
			}else {
				if(a < c) {
					System.out.println("a : " + a);
				}else {
					System.out.println("c : " + c);
				}
			}
		}
		*/
		
		
	sc.close();
	
	}

}
