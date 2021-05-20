package day02;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘은 몇일 인가요");
		//int dayInt = Integer.parseInt(sc.nextLine());
		double dayDb = Double.parseDouble(sc.nextLine());
		System.out.println(dayDb);
						
		sc.close();
	}

}
