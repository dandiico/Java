package day06;
import java.util.Scanner;
public class ArrEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,20,30,40,50};
		
		// 문제1-1 int형의 방5개 배열을 만들고, 10,20,30,40,50을 저장하고 출력
		/**/
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 문제1-2 위에서 만든 배열을 이용하여
		//			인덱스번호 1번과 3번안에 있는 데이터를 더한 값을 출력
		/**/
		System.out.println(arr[1] + arr[3]);
		
		// 문제1-3 인덱스 번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력
		/**/
		System.out.println("인덱스 번호를 입력하시오(0~4)");
		int idx = Integer.parseInt(sc.nextLine());
		System.out.println(arr[idx]);
		
		// 문제1-4 배열안의 모든 요소를 다 더한 값을 출력
		/**/
		int total = 0;
		for(int i =0; i<arr.length; i++) {
			 total += arr[i];
		}
		System.out.println(total);
		
		// 문제1-5 배열안에 있는 값중 한개를 입력하면
		//			그 값이 위치한 인덱스번호를 출력
		/**/
		System.out.println("10,20,30,40,50 중 값을 입력하시오");
		int val = Integer.parseInt(sc.nextLine());
		// 그 값이 위치한 인덱스번호를 출력
		// 10입력시 10이 들어있는 인덱스 번호 출력 > 1
		
		for(int i = 0; i<arr.length; i++) {
			if(val == arr[i]) {
				System.out.println("인덱스번호 : " + i);
			}
		}
		
		// 문제1-6 인덱스번호 2번과 4번방의 값을 교환해서 저장
		/**/
		System.out.println("2번방 값 : " + arr[2]);
		System.out.println("4번방 값 : " + arr[4]);
		
		int tmp = arr[2];
		arr[2] = arr[4];
		arr[4] = tmp;
		
		System.out.println("2번방 값 : " + arr[2]);
		System.out.println("4번방 값 : " + arr[4]);
		
		
		// 문제1-7 (심화) 내림차순으로 정렬(큰수>작은수 순서로 다시 저장)
		// 방에 있는 값끼리 전부 비교하여 큰수부터 다시 저장하기, 버블정렬, 선택정렬
		// 선택정렬 : 가장큰수 구해서 앞으로 자리이동
		// 자리이동은 가장큰 숫자가 들어있는 방번호를 알아야 방번호끼리 교환
		//선택정렬
		for(int i = 0; i<arr.length-1; i++) {
			int max = i; // 시작 값 넣기
			// 최대값 위치 찾기
			for(int j = i+1; j<arr.length; j++) {
				if(arr[max] < arr[j]) {
					max = j;
				}
			}
		// max에 최대값의 인덱스번호가 남아있음
		int tmp = arr[i];
		arr[i] = arr[max];
		arr[max] = tmp;
		}
		
		// 출력해서 확인
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//버블 정렬
		for(int i = 0; i <arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

	}

}
