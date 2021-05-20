package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx02 {

	public static void main(String[] args) {

		// 영한 사전 만들기 : HashMap을 이용하여 10개의 단어를 영어, 한글의 쌍으로 저장
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료
		
		HashMap<String, String> dict = new HashMap<String, String>();
		dict.put("pretty", "이쁜");
		dict.put("cute", "귀여운");
		dict.put("handsome", "멋진");
		dict.put("implements", "구현");
		dict.put("interface", "인터페이스");
		dict.put("extends", "확장하다");
		dict.put("abstract", "추상적인");
		dict.put("dandico", "천재");
		dict.put("love", "사랑");
		dict.put("star", "별");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("찾고싶은 단어>>");
			String eng = sc.nextLine();
			if(eng.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			String kor = dict.get(eng);
			if(kor == null) System.out.println(eng + "는 없는 단어 입니다");
			else System.out.println(kor);
		}
		
		/*
		Set<String> keys = dict.keySet(); // h의 key들만 뽑아서 keys 보따리에 넣기
		System.out.println("영한사전");
		
		boolean run = true;
		while(run) {
			Iterator<String> it = keys.iterator(); // keys의 반복자 생성
			System.out.println("영어단어를 입력해주세요>>");
			String str = sc.nextLine();
			if(!str.equals("exit")) {
			// 입력받은 단어와 key 같은지 확인
				while(it.hasNext()) { // key가 없을때까지 반복
					String key = it.next(); // key 하나 꺼내짐
					if(key.equals(str)) {
						String value = dict.get(key); // 꺼내진 key로 해쉬맵에서 value 꺼내기
						System.out.println( key +": " + value);
						break;
					}
				}
			}else {
				System.out.println("프로그램 종료");
				run = !run;
				break;
				
			}
		}
		sc.close();
		*/
	}

}
