package day18;

import java.util.HashMap;
import java.util.Scanner;

/*
"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 아래 해쉬맵을 이용하세요.
HashMap<String, Integer> nations = new HashMap<String, Integer>();
실행예시 :
	나라 이름과 인구를 입력하세요.(예: Korea 5000)
	나라 이름, 인구 >>  Korea 5000
	나라 이름, 인구 >>  USA 1000000
	나라 이름, 인구 >>  Swiss 2000
	나라 이름, 인구 >>  France 3000
	나라 이름, 인구 >>  그만
	인구 검색 >> France
	France의 인구는 3000
	인구 검색 >> 스위스
	스위스 나라는 없습니다.
	인구 검색 >> 그만
	프로그램 종료!
*/
public class UtilEx03 {
	private HashMap<String, Integer> nations;
	private Scanner sc;
	UtilEx03(){
		nations = new HashMap<String, Integer>();
		sc = new Scanner(System.in);
	}
	
	void run() {
		while(true) {
			System.out.println("인구 검색>> ");
			String str = sc.nextLine();
			if(nations.containsKey(str) == true) {
				System.out.println(str + "의 인구는 " + nations.get(str));
			}else if(str.equals("그만")) {
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println(str + " 나라는 없습니다.");
			}
		}
	}
	public static void main(String[] args) {
		UtilEx03 util = new UtilEx03();
		
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		while(true) {
			System.out.println("나라 이름, 인구>> ");
			String str = util.sc.nextLine();
			if(str.equals("그만")) {
				util.run();
				break;
			}else {
				String [] arr = str.split(" ");
				util.nations.put(arr[0], Integer.parseInt(arr[1]));
			}
		}
	}
}
