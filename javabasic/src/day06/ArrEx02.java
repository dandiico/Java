package day06;

public class ArrEx02 {

	public static void main(String[] args) {
		
		// 반복문 사용
		int [] num = new int[5]; // 값저장x
		// 저장
		System.out.println(num[0]); // 0~ 9 : 인덱스번호로 활용
		for(int i =0; i<num.length; i++) {
			num[i] = 100;
		}
		// 출력
		for(int i =0; i<num.length; i++) {
			System.out.println(num[i]);
		}

		// 초기화
		int [] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String [] str = {"java", "jsp", "spring"};
		for(int i =0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		// 문제 최대값, 최소값 구하기
		int [] score = {45,132,55,0,465,58,1000,-1000};
		// 배열 안에 있는것들은 전부 비교해야 함, 비교하는것을 반복 > 비교하는것은 if
		// 최대값
		int max = score[0]; // 첫번째 방의 값을 넣고 시작
		for(int i=0; i<score.length; i++) {
			// max변수와 각 방의 값을 비교해서 max가 크면
			// max변수를 방의 값으로 덮어쓰기
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println(max);
		//최소값
		int min = score[0]; // 가장 적을 수를 들고 있을 변수
		for(int i = 0; i <score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println(min);
		
			
			
			
		
	}

}
