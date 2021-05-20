package day18;

import java.util.Scanner;
import java.util.Vector;

/*
Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
실행예시:
	정수>> 10
	정수>> 6
	정수>> 22
	정수>> 6
	정수>> 88
	정수>> 77
	정수>> -1
	가장 큰 수는 88
*/
public class UtilEx01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		while(true) {
			System.out.println("양의 정수를 입력하시오. (단, -1 입력시 프로그램 종료)");
			try {
				int num = Integer.parseInt(sc.nextLine());
				if(num == -1) {
					System.out.println("가장 큰 수는 " + max);
					break;
				}else if(num < 0) {
					System.out.println("잘못 입력하셨습니다. 양의 정수만 입력 가능합니다.");
				}else {
					v.add(num);
					if(max < num) max = num;
				}
			}catch(NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다. 양의 정수만 입력 가능합니다.");
			}
		}
		
		

	}
}
