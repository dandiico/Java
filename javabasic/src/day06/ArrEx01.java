package day06;

public class ArrEx01 {

	public static void main(String[] args) {
		
		// 배열 선언
		// int a;
		int [] score;
		// a=10; // 값저장
		score = new int[5]; // int형 배열 방 5개 만들기, 공간만 만들고 값저장 X
		// int a =10;
		// 배열 선언 + 생성
		int [] num = new int[3];
		
		// 값 저장
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		// 값 출력
		System.out.println(++num[0]); //11
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num[3]); // 배열 방번호 오류
		System.out.println(num); // 주소 출력
		
		// int a = num; // 오류, 주소값을 변수에 넣을 수 없음
		int a = num[1];
		System.out.println(a);
		
		System.out.println(num.length); // 방의 개수
		
		for(int i=0; i<3; i++) {
			System.out.println(num[i]);
		}
		
	}

}
