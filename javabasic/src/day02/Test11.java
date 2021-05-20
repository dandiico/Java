package day02;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체 생성을 하나만 하는 이유, 기능은 동일하기에 여러개 만들필요 없음, 메모리 차지함
		
		// 입력받기
		System.out.println("이름을 입력해주세요 : "); // console에 무엇을 입력해야하는지 메세지 띄우기
		String name = sc.nextLine(); // 입력받아서 name 변수에 입력받은 문자열 저장
		System.out.println(name); // 입력+저장이 잘 됐는지 name변수 출력해서 확인
		
		System.out.println("나이를 입력해주세요 : ");
		String age = sc.nextLine(); // 무엇을 적던 전부 문자열로 가져옴
		// int ageInt = (int)age; // String은 기본형(int..)으로 바로 형변환이 안된다. 참조형과 기본형은 호환이 안됨 
		int ageInt = Integer.parseInt(age); // String 변수 age를 int로 선언한 변수 ageInt로 형변환에서 넣기
		double ageDb = Double.parseDouble(age); // String > double
		System.out.println(age); // 입력받아서 age변수에 입력 받은 문자열 저장
		System.out.println("내년 당신의 나이는 " + (ageInt+1) + "살 입니다."); // age가 문자열이기 때문에 문자로 인식되서 입력됨
		
		
		
		
		sc.close();

	}

}
