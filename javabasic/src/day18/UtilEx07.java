package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
이름과 학점(4.5만점)을 5개 입력받아 해쉬맴에 저장하고, 
장학생 선발 기준을 입력받아 장학생 명단을 출력하세요.
실해예시:
	자바장학금관리시스템입니다.
	이름과 학점 >> 호크아이 3.1
	이름과 학점 >> 블랙위도우 3.6
	이름과 학점 >> 토르 2.9
	이름과 학점 >> 데드풀 3.7
	이름과 학점 >> 아이언맨 4.3
	장학생 선발 학점 기준 입력 >> 3.2
	장학생 명단 : 블랙위도우 데드풀 아이언맨
*/
class Scholarship{
	private String sysName;
	Map<String, Double> map = new HashMap<String, Double>();
	Scanner sc = new Scanner(System.in);
	
	Scholarship(String sysName){
		this.sysName = sysName;
	}
	void read(){
		System.out.println(sysName + " 관리 시스템 입니다.");
		for(int i = 0; i<5; i++) {
			System.out.println("이름과 학점>> ");
			String input = sc.nextLine();
			String [] arr = input.split(" ");
			map.put(arr[0], Double.parseDouble(arr[1]));
		}
	}
	void select(){
		System.out.println("장학생 선발 학점 기준 입력>> ");
		double standard = Double.parseDouble(sc.nextLine());
		// 기준에 맞는 학생들 이름 넣어놓을 Arraylist 생성
		List<String> arr = new ArrayList<String>();
		// 키들만 모아놓고 반복자 얻어오기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(map.get(key) > standard) {
				arr.add(key);
			}
		}
		System.out.print("장학생 명단: ");
		for(int i = 0; i < arr.size(); i++) {
		System.out.print(arr.get(i));
		System.out.print(" ");
		}
		System.out.println();
	}
}
public class UtilEx07 {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("자바장학금");
		sship.read();
		sship.select();
	}
}
