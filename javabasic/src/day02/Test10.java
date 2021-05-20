package day02;

// 1) Scanner 클래스를 사용할거야
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		// 2) 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 3) 입력 받기 : String 변수명 = sc.nextLIne(); : 입력 받으려고 기다리고 있음, 입력받은것을 저기로 가지고감
		System.out.println("이름을 입력하세요>>");
		String input = sc.nextLine(); // nextLine은 전부 문자열로 가지고옴
		System.out.println(input);
		
		
		// 4) Scanner 닫기
		sc.close();
		System.out.println("프로그램 종료");
		
	} // main

} // class
