package day02;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘 먹은 점심을 입력하세요");
		String lunch = sc.nextLine();
		System.out.println(lunch);
		
		System.out.println("오늘 먹을 저녁을 입력하세요 : ");
		String dinner = sc.nextLine();
		System.out.println(dinner);
		
		
		System.out.println("즐거운 저녁 되세요:)");
		
		sc.close();
	}

}
