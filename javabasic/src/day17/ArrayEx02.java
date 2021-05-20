package day17;

import java.util.ArrayList;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // Integer 타입의 객체만 넣을 수 있는 arr 객체 생성
		arr.add(10); // 첫번째 요소 추가
		arr.add(20); // 두번째 요소 추가
		arr.add(30); // 세번째 요소 추가
		arr.add(2, 100); // index 2번 지정하여 요소 저장 > 요소가 있었다면 뒤로 하나씩 밀림
		
		// 모든 방에 접근해서 요소 꺼내 출력
		for(int i = 0; i < arr.size(); i++) { // ArrayList 크기, 저장된 데이터 수는 size() 메소드로 알 수 있음!
			int a = arr.get(i); // 언박싱
			System.out.println(a);
		}
		
		// arrayList의 모든 정수를 다 더한 총합
		int sum = 0;
		for(int i = 0; i<arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println("총합: " + sum);
	}

}
