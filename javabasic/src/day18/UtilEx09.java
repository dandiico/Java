package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
나라와 수도 맞추기 게임을 만들어 보세요. 
1) UtilEx08문제를 HashMap<String, String>을 이용하여 작성하세요. 
	Key는 나라이름이고, Value는 수도입니다.

*/

class CapitalGame2{
	HashMap<String, String> map = new HashMap<String,String>();
	Scanner sc = new Scanner(System.in);
	// 뽑아 놓을 key들 담아놓을 list 만들기
	ArrayList<String> list = new ArrayList<String>();
	
	// key들만 뽑아서 모아놓기
		void keys() {
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			// key들 전체 꺼내서 list에 담기
			while(it.hasNext()) {
				String key = it.next();
				list.add(key);
			}
		}
		
	}
				
	void setting() {
		map.put("그리스","아테네");
		map.put("중국","베이징");
		map.put("러시아","모스크바");
		map.put("독일","베를린");
		map.put("그리스","아테네");
		map.put("노르웨이","오슬로");
		map.put("세네갈","다카르");
		map.put("스웨덴","스톡홀름");
	}
	
	void input() {
		System.out.println("현재" + map.size() + "나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.println("나라와 수도 입력" + map.size()+1);
			String str = sc.nextLine();
			// 입력받은 문자열 나눠서 배열에 담아넣기
			String[] arr = str.split(" ");
			
			for(int i = 0; i<list.size(); i++) {
				if(str.equals("그만")) {
					break;
				}else if(arr[0].equals(list.get(i))) {
					System.out.println(arr[0] + "은 이미 있습니다!!");
				} map.put(arr[0], arr[i]);
			}
			
		}
	}
	void quiz() {}
	
	void run() {
		System.out.println("**수도 맞추기 게임을 시작합니다**");
		while(true) {
			setting();
			System.out.println("입력:1, 퀴즈:2, 종료:3 >> ");
			int sel = sc.nextInt();
			if(sel == 1) {
				input();
			}else if(sel == 2) {
				quiz();
			}else if(sel == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			else {System.out.println("잘못 입력하셨습니다. 다시시도 해주세요");}
		}
	}
}
public class UtilEx09 {
	public static void main(String[] args) {
		
		CapitalGame2 game = new CapitalGame2();
		game.run();
		
	}
}
