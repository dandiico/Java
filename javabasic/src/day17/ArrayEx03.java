package day17;

import java.util.ArrayList;

public class ArrayEx03 {

	public static void main(String[] args) {

		// 제네릭타입 지정 없이 사용할때
		// 문자열을 저장하고, 문자열의 UpperCase 기능으로 전체 대문자로 출력
		ArrayList arr = new ArrayList();
		arr.add("Apple");
		arr.add("oRange");
		System.out.println(arr);
		
		for(int i = 0; i<arr.size(); i++) {
			 Object o = arr.get(i); // 제네릭타입을 지정안해줘서 Object로 리턴을 해줌
			 String str = (String)o; // String의 메소드를 사용하기위해 String으로 형변환
			 // String str = (String)arr.get(i); // 짧게 쓰면 이렇게 가능
			 System.out.println(str.toUpperCase());
		}
		for(Object o : arr) {
			String s = (String)o;
			System.out.println(s);
		}
		
		// 제네릭 O
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Apple");
		arr2.add("oRange");
		System.out.println(arr2);
		
		for(int i = 0; i<arr2.size(); i++) {
			String str = arr2.get(i);
			System.out.println(str.toUpperCase());
		}
		for(String s : arr2) {
			System.out.println(s);
		}
	
	}

}
