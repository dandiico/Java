package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		// 이름을 4개 입력받아 ArrayList에 저장하고,
		// 모두 출력한 후 제일 긴 이름을 출력하세요. (영문이름으로)
		
		ArrayList<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<4; i++) {
			System.out.println("이름>> ");
			String name = sc.nextLine();
			array.add(name);
		}
		
		for(int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		// 이름이 가장 긴 사람의 이름을 출력
		int max = 0;
		for(int i = 0; i<array.size(); i++) {
			if(array.get(max).length() < array.get(i).length()) {
				max = i;
			}
		}
		System.out.println("가장 긴 이름은: " + array.get(max));
	}
}
