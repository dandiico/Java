package day07;

public class ArrEx09 {

	public static void main(String[] args) {
		
		//***랜덤***
		/*
		System.out.println(Math.random()); // 0~1 사이의 실수
		
		// 0~9사이 랜덤값을 출력
		for(int i =0; i<5; i++){
			System.out.print((int)(Math.random() * 10));
		}
		
		System.out.println();
		
		// 문제0 0~5 사이 랜덤값 출력
		System.out.println((int)(Math.random() * 6));
	
		// 문제1 1~5 사이 랜덤값 출력
		System.out.println((int)(Math.random() * 5) + 1);
		
		// 문제2 12~17 사이 랜덤값 출력
		System.out.println((int)(Math.random() * 6) + 12);
		*/
		
		// 문제3 로또 번호 랜덤으로 생성하기
		//		1~45 사이 임의의 번호 6개 선택하고, 오름차순으로 정렬 > 출력
		
		// 임의의 번호가 나왔을시 담아둘 길이6개짜리 배열 변수 생성
		int [] lotto = new int[6];
		// 랜덤 번호 6번 나오도록 해주고, 나올때마다 차곡차곡 lotto 배열에 넣어주기
		for(int i =0; i<lotto.length; i++){
			lotto[i] = (int)(Math.random() * 45)+1;
			// 처음부터 지금 뽑은것 전까지 반복해서
			// 지금 뽑은수가 이전수와 동일한지 검사
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 6개 나온값들 비교하여 값 교환하기, 교환하기 위해 잠깐 가지고 있을 tmp 변수 생성
		for(int i =0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++)
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = tmp;
				}
			}
		// 출력 확인
		for(int i =0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		

	}

}
