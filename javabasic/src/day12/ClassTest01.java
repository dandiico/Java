package day12;
/*
	n명이 참가하는 끝말 잇기 게임을 만들어보자. 
	처음 단어는 "자동차"이다. n명의 참가자들은 순서대로 자신의 단어를 입력하면 된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람이름 출력, 종료
	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스 작성 .
	WordGameApp : 게임을 전체적으로 진행하는 run()메서드, run()에서 플레이어수만큼 Player객체 배열 생성
	Player : 플레이어 이름, 단어 입력받는 getWordFromUser()메서드, 끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
	#tip:문자열 첫번째 문자 알아내는 방법은  .charAt(인덱스번호) 사용 
*/
import java.util.Scanner;
class Player {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String inputWord;
	
	void setinfo(){
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
	}
	
	public String getName() {
		return name;
	}

	String getWordFromUser() { // 단어 입력받는 메소드
		System.out.println(name + ">>"); // 이름 띄워주고 단어 입력 받기
		inputWord = sc.nextLine();
		return inputWord; // 입력받은 단어를 돌려줘야지 체크할 수 있기 때문에
	}
	boolean checkSuccess(String startWord){ // 들어온 단어 마지막에 있는 문자와 입력한 단어 첫번째 문자 비교해주기
		boolean resualt = true;
		if(startWord.charAt(startWord.length()-1) == inputWord.charAt(0)){// 단어길이 - 1 한게 마지막번째 문자자리수가 되고, 첫번째 문자는 언제나 0번째
			return resualt; // 비교해서 맞을경우 true 리턴
		} return !resualt; // 아닐 경우 false 리턴
		}
	
}
class WordGameApp {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		System.out.println("끝말잇기 게임 Start!");
		System.out.println("참가 인원수를 입력하시오");
		int userNum = Integer.parseInt(sc.nextLine());
		// 참가자 수만큼 배열방 만들어주기 
		Player [] p = new Player[userNum]; // 배열방만 만든상태 값 없음
		// 배열 객체 생성해주기
		for(int i = 0; i<p.length; i++) {
			p[i] = new Player();
		}
		// 참가자수만큼 참가자 이름 받아서 각 객체 배열에 넣어주기
		for(int i = 0; i<p.length; i++) {
			p[i].setinfo();
		}
		// 처음 시작 단어 저장
		String startWord = "자동차";
		System.out.println("시작 단어는 " + startWord + "입니다.");
		// 한명이 잘못 입력할때까지 게임이 돌아가야 함 > 언제 끝날지 모름 > 무한반복
		boolean play = true;
		while(play) {
			for(int i = 0; i<p.length; i++) { // 게임인원수만큼 반복
			String inputWord = p[i].getWordFromUser(); // 첫번째 유저가 단어 입력 받음 변수에 받아줘야함
			// 시작단어와, 입력받은 단어 비교해주기
			// 입력받은 단어는 player 객체에 변수 선언하여 저장되어 있으니 시작단어 던져주기
			boolean resalt = p[i].checkSuccess(startWord); // t/f로 체크 가능하니 boolean 타입의 변수 만들어서 값 넣어주자
			if(resalt == true) {
				System.out.println(inputWord); // 입력단어 출력해주고
				startWord = inputWord; // 비교해줄 단어가 되어야하니까 startWord에 넣어주기
			}else{
				System.out.println(p[i].getName() + " 게임종료!");
				i = p.length; // for문 끝내주기
				play = false; // while문 끝내주기
			}
			}
				
		}
		
	}
	
}

public class ClassTest01 {
	public static void main(String[] args) {
		// main 메서드는 아래 두줄로 작성 끝. 실행하면 게임시작되게 하기. 
		WordGameApp app = new WordGameApp();
		app.run();
	}
}
