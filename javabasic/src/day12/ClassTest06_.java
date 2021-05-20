package day12;
import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
	
class MonthSchedule {
	private int  nDays;	// 한달의 일수
	private Day[] days; // day객체 배열
	Scanner sc = new Scanner(System.in);
	
	MonthSchedule(int nDays) {
		this.nDays = nDays;
		days = new Day[nDays]; // 배열 공간 만들기 (Day객체생성해서 저장가능해짐)
		for(int i = 0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	void input() {
		System.out.println("날짜(1 " + nDays + ")?");
		int day = Integer.parseInt(sc.nextLine());
		System.out.println("할일");
		String work = sc.nextLine();
		days[day-1].set(work);
	}
	
	void view() {
		System.out.println("날짜(1~" + nDays + ")?");
		int day = Integer.parseInt(sc.nextLine());
		System.out.println(day + "일의 할일은 ");
		days[day-1].show();
	}
	
	void finish() {
		//sc.close();
		System.out.println("프로그램 종료");
		//return sc;
	}
	
	
	void run() {
		boolean run = true;
		System.out.println("이번달 스케쥴 관리 프로그램.");

		while(run) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 : input(); break;
			case 2 : view(); break;
			case 3 : //Scanner sc = finish();
				finish(); return; // run 메서드 종료
			default :
				System.out.println("잘못 입력하였습니다. 다시 눌러 주세요.");
			}
		}
		
	}
		
}
	

/*
 */
public class ClassTest06_ {
	
	public static void main(String[] args) {
		MonthSchedule may = new MonthSchedule(31); // 5월달의 할 일
		may.run();
		MonthSchedule jun = new MonthSchedule(30); // 6월달의 할 일
		jun.run();
		
		//Scanner sc = may.run();
		//sc.close();
	
	}
}
