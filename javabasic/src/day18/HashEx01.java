package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashEx01 {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("apple", "사과");
		h.put("strawberry", "딸기");
		h.put("watermelon", "수박");
		h.put("peach", "복숭아");
		
		System.out.println(h);
		h.put("apple", "대구사과"); // value 덮어쓰기 됨
		System.out.println(h);
		System.out.println("================");
		
		String val = h.get("apple");
		System.out.println(val);
		String val2 = h.get("melon");
		System.out.println(val2);
		System.out.println("================");
		
		String str = h.remove("peach"); // 삭제하면서 value 한번 리턴
		System.out.println(str);
		System.out.println(h.size());
		System.out.println("================");
		
		Set<String> keys = h.keySet(); // hashmap의 모든 key들만 꺼내옴
		Iterator<String> it = keys.iterator(); // key들의 반복자 얻기
		while(it.hasNext()) { // key가 없을때까지 반복
			String key = it.next(); // key 하나 꺼내짐
			String value = h.get(key); // 꺼내진 key로 해쉬맵에서 value 꺼내기
			System.out.println("{" + key +"," + value + "}");
		}
		
	}
}
