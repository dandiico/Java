package day07;

public class ArrEx06 {

	public static void main(String[] args) {
		
		// 정방배열 
		int [][] ar = new int[2][3]; // 선언+생성
		// 각 방에 값 대입 [행인덱스][열인덱스]
		ar[0][0]=100;
		ar[0][1]=200;
		ar[0][2]=300;
		ar[1][0]=400;
		ar[1][1]=500;
		ar[1][2]=600;
		
		// 초기화 ( new 생략하고 바로 선언과 동시에 값 대입)
		int [][] arr = {{100,200,300,},{400,500,600}}; // 2행 3열
		System.out.println(arr.length); // 행의 개수
		System.out.println(arr[0].length); // 0번째 요소의 길이 즉,열의 개수
		System.out.println(arr.length*arr[0].length); // 총 방의수
		
		// 전체출력
		for(int i=0; i<arr.length; i++) { // 행 기준 반복
			for(int j=0; j<arr[i].length; j++) { // 열 기준 반복
				System.out.println(arr[i][j]);
			}
		}
		
		// 비정방배열
		int [][] arr2 = new int[2][]; // 내부길이는 비워두고 외부길이는 정해놔야함 // 행의 개수는 지정해줘야한다
		arr2[0] = new int[3]; // 0번 행에는 방 3개짜리 만들기
		arr2[1] = new int[2]; // 1번 행에는 방 2개짜리 만들기
		//이제부터 사용가능
		
		// 비정방배열 초기화
		int [][] arr3 = {{10,20,30},{40,50}};
		// 행,열의 길이 출력
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println(arr3[1].length);
		
		// 전체 출력
		for(int i =0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
	
		
	}

}
