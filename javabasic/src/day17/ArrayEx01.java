package day17;

import java.util.ArrayList;

public class ArrayEx01 {

	public static void main(String[] args) {
		// #1. ArrayList 생성
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//ArrayList<Integer> arr2 = new ArrayList<Integer>(20); 용량이 부족하면 알아서 추가되니까 처음에 굳이 많이 만들 필요없음
		
		// #2. 요소 추가
		arr.add(new Integer(10));
		arr.add(new Integer(20));
		arr.add(new Integer(-100));
		
		arr.add(1); // 자동 박싱 new Integer(1);과 동일
		arr.add(2);
		arr.add(3);
		
		arr.add(null); // null 삽입 가능함에 주의
		arr.add(2, 10000); // add(index, 요소) // 중간에 낑겨넣기 가능
		
		System.out.println(arr);
		
		// #3. 요소 꺼내기
		int a = arr.get(0); // get(index) 자동 언박싱됨
		System.out.println(a);
		
		// #4. 크기
		System.out.println("저장된 데이터의 수: " + arr.size());
		
		// #5. 삭제
		int b = arr.remove(2); // remove(index)
		System.out.println(arr);
		arr.remove(new Integer(10)); // remove(요소) 요소는 객체로 지정
		System.out.println(arr);
		
		System.out.println(arr.contains(-20)); // 요소가 ArrayList에 들어있는지 검사

	}

}
