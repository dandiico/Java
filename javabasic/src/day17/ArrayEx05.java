package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		
		list1.add(0);
		list1.add(2);
		list1.add(98);
		list1.add(54);
		
		//list1.subList(0, 4); > index0부터 index4전까지의 사이에 있는 값 반환 > 0~3까지
		System.out.println("list1: " + list1.subList(0, 4));
		ArrayList list2 = new ArrayList(list1.subList(1,4)); // list1의 1~3까지의 요소로 list2 변수 초기화
		System.out.println("list2: " +list2);
		Collections.sort(list1); // 오름차순으로 정리
		System.out.println("list1 오름차순 정리 후: " + list1);
		
		list2.add(9);
		System.out.println("list1이 list2를 전부 포함하고 있나: " + list1.containsAll(list2)); // 전부 포함하고 있냐
		System.out.println("-------------");
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		// list1에서 list2와 같은 요소를 제외한 나머지 삭제 (교집합)
		System.out.println("list1에서 list2의 요소만 유지: " + list1.retainAll(list2));
		System.out.println(list1);
		
		List a = new ArrayList(); // List가 부모 클래스 임으로 ArrayList로 객체 생성가능
		a = new Vector(); // 얘도 마찬가지
		


	}

}
