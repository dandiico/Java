package day05;
import java.util.Scanner;
public class Test36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Q1 구구단 2단 출력
		/*
		for(int i = 1; i <=9; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		*/
		
		// Q2 구구단 단수를 입력받아, 해당 단을 출력
		// ex 단 입력 >> 3
		// 3 * 1 = 3
		// ...
		/*
		Scanner sc = new Scanner(System.in);
		//구구단 단수 입력받기
		System.out.println("단수를 입력하시오");
		int dan = Integer.parseInt(sc.nextLine());
		// 입력 받은 단수 출력, 입력받은 단수는 고정, 곱하는 수 1씩증가
		for(int i =1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		*/
		
		// Q3 구구단 전체 출력 (2단~9단)
		/*
		for(int i = 2; i <= 9; i++) {
			System.out.println("***" + i + " 단 ***");
			for(int j = 1; j <=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		*/
		
		// Q4 구구단 전체 출력(1~9단), 출력 배치 변경
		/* *** 1단 ***   *** 2단 *** *** 3단 ***
		 * 1 * 1 = 1	 2 * 1 = 2	  3 * 1 = 3
		 * 1 * 2 = 2	 2 * 2 = 4	  3 * 2 = 6
		 * ....
		 */
		/*
		for(int i=1; i < 10; i+=3) { // 1단~9단
			System.out.println("*** " + i +"단 ***\t*** "+ (i+1) +"단 ***\t*** "+(i+2)+"단 ***"); // 3번 반복

			for(int j = 1; j < 10; j++) { // *1~*9
				System.out.print(i+" * "+j+" = "+i*j+"\t");
				System.out.print(i+1+" * "+j+" = "+i+1*j+"\t");
				System.out.println(i+2+" * "+j+" = "+i+2*j);
			}
			System.out.println();
		}
		*/
		
		// Q5 별찍기
		
		
		
		
		
		
		
		
		sc.close();
	}

}
