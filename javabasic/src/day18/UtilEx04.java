package day18;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하세요.
강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
실행 예시 :
	강수량 입력 (0 입력시 종료)>>	5
	5
	현재 평균 5
	강수량 입력 (0 입력시 종료)>>	80
	5 80
	현재 평균 42
	강수량 입력 (0 입력시 종료)>>	53
	5 80 53
	현재 평균 46
	강수량 입력 (0 입력시 종료)>>	22
	5 80 53 22
	현재 평균 40
	강수량 입력 (0 입력시 종료)>>	0
	프로그램 종료!
*/
public class UtilEx04 {
	public static void main(String[] args) {
		Vector<Integer> rainfall = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("강수량 입력 (0 입력시 종료)>> ");
			int rain = Integer.parseInt(sc.nextLine());
			if(rain == 0) {
				System.out.println("프로그램 종료!");
				break;
			}
			rainfall.add(rain);
			for(int i = 0; i<rainfall.size(); i++) {
				System.out.print(rainfall.get(i) + " ");
			}
			System.out.println();
			Iterator<Integer> it = rainfall.iterator();
			int sum = 0;
			while(it.hasNext()) {
				sum += it.next();
			}
			System.out.println("현재 평균 " + sum/rainfall.size());
		}
		
	}
}
