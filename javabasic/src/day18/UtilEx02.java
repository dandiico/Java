package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
평균을 출력하는 프로그램을 작성하세요.
실행예시:
	6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D
	2.3333333333333335
*/
public class UtilEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> grade = new ArrayList<String>();
		System.out.println("** 학점 입력 프로그램 **");
		System.out.println("학점 입력>> (예: A C A B F D)");
		String input = sc.nextLine().toUpperCase();
		String[] arr = input.split(" ");
		for(int i = 0; i<arr.length; i++) {
			grade.add(arr[i]);
		}
		System.out.println("학점 입력 완료!");
		
		System.out.println("** 학점 평균 프로그램 **");
		Iterator<String> it = grade.iterator();
		//ArrayList<Integer> score = new ArrayList<Integer>();
		double tot = 0;
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("A")) {
				tot += 4;
			}else if(str.equals("B")) {
				tot += 3;
			}else if(str.equals("C")) {
				tot += 2;
			}else if(str.equals("D")) {
				tot += 1;
			}else if(str.equals("F")) {
				tot += 0;
			}
		}
		System.out.println("학점 총 평균 : " + tot/grade.size());
			
	}
}
