package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except03 {

	public static void main(String[] args) {
		
		// 3개의 정수를 입력받아 합을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0; // 총합계
		int num = 0; // 입력받을 변수
		for(int i = 0; i < 3; i++) {
			System.out.println(i+1 + " >>");
			//java.util.InputMismatchException
			try {
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				sc.nextLine(); // 버퍼 비우기 (토큰 방식으로 입력받아서)
				i--;	// 같은 회차의 for문 반복시키기 위해 i 먼저 1감소
				continue;	// 다음 반복으로 넘어가라 sum+=num 안하고 건너뛰기
			}
			sum += num;
		}
		System.out.println("합은: " + sum);
		
		
		sc.close();
	}

}
