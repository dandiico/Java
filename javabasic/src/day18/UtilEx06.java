package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
UtilEx05문제를 ArrayList<StudentClass>대신 
HashMap<String, StudentClass> 을 이용하여 다시 작성해보세요. 
해쉬맵에서 키는 학생 이름으로 한다.
*/
public class UtilEx06 {
	HashMap<String, StudentClass> map = new HashMap<String, StudentClass>();
	Scanner sc = new Scanner(System.in);
	
	void run() {
		// 학생정보 ArrayList에 저장
		for(int i = 0; i<4; i++) {
			System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
			System.out.print(">> ");
			String str = sc.nextLine();
			String [] arr = str.split(",");
			map.put(arr[0], new StudentClass(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3])));
		}
		// 모든 학생 정보 출력
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		StudentClass tmp = new StudentClass();
		while(it.hasNext()) {
			String key = it.next();
			tmp = map.get(key);
			System.out.println("이름: " + tmp.getName());
			System.out.println("학과: " + tmp.getMajor());
			System.out.println("학번: " + tmp.getYear());
			System.out.println("학점평균: " + tmp.getGradeAvg());
			System.out.println("---------------------------");
		}
		// 학생 이름 입력받아 학생 정보 출력
		while(true) {
			System.out.println("학생 이름>> ");
			String str = sc.nextLine().trim();
			if(!str.equals("그만")) {
				map.get(str).showInfo();
			}
			else {
				System.out.println("프로그램 종료!");
				break;
			}
			}
		}

	public static void main(String[] args) {

		UtilEx06 ex = new UtilEx06();
		ex.run();
		
	}
}
