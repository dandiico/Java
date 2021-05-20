package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashEx06 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이스프링", new Integer(80));
		map.put("최에스큐엘", new Integer(90));
		map.put("박제이에스피", new Integer(100));
		
		// Set<Map.Entry<K, V>> entrySet() : 맵내에 보관 유지되고 있는 매핑의 세트뷰 반환
		// Map.Entry : 맵의 엔트리(키 벨류 쌍)
		// Map.EntrySet 메소드는 이 클래스에 속하는 요소를 가지는 맵의 코레크션뷰를 돌려줍니다.
		//
		Set set = map.entrySet(); // 김자바=100;
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
	}
}
