package day02;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		// 이름, 나이, 혈액형, 주소 입력받아 출력해보기.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : "); // console에 메세지 출력
		String name = sc.nextLine(); // 입력받아 변수에 저장
		System.out.println(name); // 입력받은 메세지 출력
		
		System.out.println("나이를 입력하세요 : ");
		
		/*
		sc.nextLine() : 입력받아서 가지고 오는 역할,기능으로 이곳에 저장되는 것은 아님
		String age = sc.nextLine();
		int ageInt = Integer.parseInt(age);
		위에 두줄을 한줄로 줄이기
		*/
		int ageInt = Integer.parseInt(sc.nextLine());
		System.out.println(ageInt);
		
		System.out.println("혈액형을 입력하세요 : ");
		String blood = sc.nextLine();
		System.out.println(blood);
		
		System.out.println("주소를 입력하세요 : ");
		String adress = sc.nextLine();
		System.out.println(adress);
		
				
		sc.close();
		}

}
