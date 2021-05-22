package day18;

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
	
	void setting() {
		map.put("스페인","마드리드");
		map.put("중국","베이징");
		map.put("러시아","모스크바");
		map.put("독일","베를린");
		map.put("그리스","아테네");
		map.put("노르웨이","오슬로");
		map.put("세네갈","다카르");
		map.put("스웨덴","스톡홀름");
	}
	
	void input() {
		System.out.println("현재 " + map.size() + "개의 나라와 수도가 입력되어 있습니다.");
		
		while(true) {
			System.out.println("나라와 수도 입력" + (map.size()+1) + ">>");
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			
			if(str.equals("그만")) {
				break;
			}
			if(map.containsKey(arr[0])) {
				System.out.println(arr[0] + "는 이미 있습니다.");
			}else {
				map.put(arr[0], arr[1]);
			}
			
		}
	}
	void quiz() {
		// key 전부 뽑아서 배열에 넣어두고, 랜덤 번호 돌려서 나오도록 하기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		String [] keysArr = new String [map.size()];
		int i = 0;
		while(it.hasNext()) {
			keysArr[i] = it.next();
			i++;
		}
		int [] randomArr = new int [keysArr.length];
		for(int j = 0; j<keysArr.length; j++) {
			randomArr[j] = (int)(Math.random()*keysArr.length);
			// 번호 중복인지 아닌지 확인후 중복일시 다시 뽑기
			for(int k = 0; k<j; k++) {
				if(randomArr[j] == randomArr[k]) {
					j--;
				}
			}
		}
		for(int t : randomArr) 
		{System.out.println(t);}
		for(String t : keysArr) 
		{System.out.println(t);}
		
		for(int n = 0; n<keysArr.length; n++) {
			System.out.println(keysArr[randomArr[n]] + "의 수도는?");
			String str = sc.nextLine();
			if(str.equals("그만")){
				break;
			}else if(map.get(keysArr[randomArr[n]]).equals(str)) {
				System.out.println("정답!!");
			} else {
				System.out.println("아닙니다!!");
			}
		}
		System.out.println("문제가 끝났습니다");
	}
	
	void run() {
		System.out.println("**수도 맞추기 게임을 시작합니다**");
		while(true) {
			setting();
			System.out.println("입력:1, 퀴즈:2, 종료:3 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			
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
		CapitalGame2 c = new CapitalGame2();
		CapitalGame2 game = new CapitalGame2();
		//game.run();
		c.run();
	}
}
