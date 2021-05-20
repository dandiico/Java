package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashEx03 {
	private HashMap<String, Integer> grade;
	private Scanner sc;
	
	public HashEx03(){
		grade = new HashMap<String, Integer>();
		sc = new Scanner(System.in);
	}
	void printAll() {
		Set<String> keys = grade.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = grade.get(key);
			System.out.println(key + ": " + value + "점");
		}
	}
	void insertData() {
		System.out.println("2.등록");
		System.out.println("이름 입력>>");
		String name = sc.nextLine();
		Set<String> keys = grade.keySet();
		if(keys.contains(name)) {
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 확인해주세요.");
			return;
		}else {
		System.out.println("점수 입력>>");
		int score = Integer.parseInt(sc.nextLine());
		grade.put(name, score);
		System.out.println("저장완료!");
		}
		
	}
	void modifyData() {
		System.out.println("3. 수정");
		System.out.println("수정할 학생 이름 입력>>");
		String name = sc.nextLine();
		Set<String> keys = grade.keySet();
		if(keys.contains(name)) { // 수정할 학생의 이름이 존재한다
			System.out.println("점수 입력>>");
			int socre = Integer.parseInt(sc.nextLine());
			grade.put(name, socre);
			System.out.println("수정완료!");
		}else {
		System.out.println("존재하지 않는 학생입니다.");
		}
	}
	void deleteData() {
		System.out.println("4. 삭제");
		System.out.println("이름 입력>>");
		String name = sc.nextLine();
		Set<String> keys = grade.keySet();
		if(keys.contains(name)) { // 수정할 학생의 이름이 존재한다
			grade.remove(name);
			System.out.println("삭제완료!");
		}else {
		System.out.println("존재하지 않는 학생입니다.");
		}
	}
	void showAvg() {
		System.out.println("5. 전체 평균");
		Collection<Integer> coll = grade.values();
		Iterator<Integer> it = coll.iterator();
		System.out.println(coll);
		int sum = 0;
		while(it.hasNext()) {
			int val = it.next();
			sum += val;
		}
		/*
		int tot = 0;
		Set<String> keys = grade.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			tot += grade.get(key);
		}
		*/
		System.out.println("전체 평균: " + ((double)sum/grade.size()));
	}

	public static void main(String[] args) {
		HashEx03 prg = new HashEx03();
		// HaspMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요
		// 아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고
		// 6번 종료를 입력받으면 프로그램 종료
		/*
		 * ** 자바 성적 관리 프로그램 **
		 * 1. 전체조회
		 * 2. 등록
		 * 3. 수정 // 학생이름 입력받기
		 * 4. 삭제 // 학생이름 입력받기
		 * 5. 전체 평균
		 * 6. 프로그램 종료
		 */
		while(true) {
			System.out.println("==============================");
			System.out.println("** 자바 성적 관리 프로그램 **");
			System.out.println("1. 전체조회");
			System.out.println("2. 등록");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 전체 평균");
			System.out.println("6. 프로그램 종료");
			System.out.println("==============================");
			System.out.println("원하는 서비스 번호 입력>>");
			int sel = Integer.parseInt(prg.sc.nextLine());
			if(sel == 1) {
				prg.printAll();
			}else if(sel == 2) {
				prg.insertData();
			}else if(sel == 3) {
				prg.modifyData();
			}else if(sel == 4) {
				prg.deleteData();
			}else if(sel == 5) {
				prg.showAvg();
			}else if(sel == 6) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력, 다시 시도해주세요.");
			}
			
		}
	}


}
