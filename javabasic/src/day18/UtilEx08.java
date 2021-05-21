package day18;

import java.util.ArrayList;
import java.util.Scanner;

/*
나라와 수도 맞추기 게임을 만들어 보세요. 
1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
	ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 
	프로그램을 작성하세요.
실행예시:
	** 수도 맞추기 게임을 시작합니다 **
	입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
	현재 8개의 나라와 수도가 입력되어 있습니다.
	나라와 수도 입력9>> 한국 서울
	나라와 수도 입력10>> 그리스 아테네
	그리스는 이미 있습니다!!
	나라와 수도 입력10>> 호주 시드니
	나라와 수도 입력11>> 이탈리아 로마
	나라와 수도 입력12>> 그만
	입력:1, 퀴즈:2, 종료:3 >> 2
	호수의 수도는? 시드니
	정답!!
	독일의 수도는? 하얼빈
	아닙니다!!
	멕시코의 수도는? 하얼빈
	아닙니다!!
	이탈리아의 수도는? 로마
	정답!!
	한국의 수도는? 서울
	정답!!
	영국의 수도는? 그만
	입력:1, 퀴즈:2, 종료:3 >> 3
	게임을 종료합니다.
*/
class Nation{
	private String country, capital;
	Nation(String country, String capital){
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
}
class CapitalGame{
	ArrayList<Nation> nation = new ArrayList<Nation>();
	Scanner sc = new Scanner(System.in);

	void setting() {
		nation.add(new Nation("그리스","아테네"));
		nation.add(new Nation("중국","베이징"));
		nation.add(new Nation("러시아","모스크바"));
		nation.add(new Nation("독일","베를린"));
		nation.add(new Nation("노르웨이","오슬로"));
		nation.add(new Nation("미얀마","네피도"));
		nation.add(new Nation("세네갈","다카르"));
		nation.add(new Nation("스웨덴","스톡홀름"));
	}


	void input() {
		System.out.println("현재 " + nation.size() + "개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
			System.out.println("나라와 수도 입력" + (nation.size()+1) +" >> ");
			String input = sc.nextLine();
			String arr[] = input.split(" ");
			if(input.equals("그만")) {
				break;
			}
			for(int i =0; i < nation.size(); i++) {
				if(arr[0].equals(nation.get(i).getCountry())) {
					System.out.println(arr[0] +"는 이미 있습니다!!");
					i = nation.size();
				}
					nation.add(new Nation (arr[0],arr[1]));

			} //for
		} //while
	}

	void quiz() {
		int [] arr = new int[nation.size()];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*nation.size());
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i =0; i<nation.size(); i++) {
			System.out.println(nation.get(arr[i]).getCountry() + "의 수도는?");
			String str = sc.nextLine();
			if(str.equals(nation.get(arr[i]).getCapital())) {
				System.out.println("정답!!");
			}else if(str.equals("그만")) {
				break;
			}else System.out.println("아닙니다");
		}

	}

	void run() {
		System.out.println("** 수도 맞추기 게임 Start **");
		setting();
		while(true) {
		System.out.println("입력:1, 퀴즈:2, 종료:3 >> ");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel == 1) input();
		else if(sel == 2) quiz();
		else System.out.println("게임을 종료합니다."); break;
		}

	}
}
public class UtilEx08 {
	public static void main(String[] args) {

		CapitalGame game = new CapitalGame();
		game.run();
	}
}