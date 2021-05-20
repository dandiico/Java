package day18;

import java.util.Iterator;
import java.util.Vector;

public class IterEx01 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>(); //Vector<E> Class로 객체 생성
		
		// 반복자를 이용해서 모든 데이터 접근
		Iterator<Integer> it = v.iterator(); // 접근해서 반복자 얻어온것
		
		while(it.hasNext()) { // 요소가 끝날때까지 반복
			int n = it.next(); // 요소 꺼내기
			System.out.println(n);
		}
		
	}

}
