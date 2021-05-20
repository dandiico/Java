package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
하나의 학생 정보를 나타내는 StudentClass에는 이름, 학과, 학번, 학점 평균을 
저장하는 필드가 있다. 
학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 ArrayList<StudentClass> 컬렉션에 
저장한 후에,
ArrayList<StudentClass>의 모든 학생(4명) 정보를 출력하고 
학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하세요.
실행예시:
	학생이름, 학과, 학번, 학점평균 입력하세요.
	>> 호크아이,모바일,1,4.1
	>> 데드풀,안드로이드,2,3.9
	>> 헐크,웹개발,3,3.5
	>> 아이언맨,빅데이터,4,4.25
	---------------------------
	이름:호크아이
	학과:모바일
	학번:1
	학점평균:4.1
	---------------------------
	이름:데드풀
	학과:안드로이드
	학번:2
	학점평균:3.9
	---------------------------
	이름:헐크
	학과:웹개발
	학번:3
	학점평균:3.5
	---------------------------
	이름:아이언맨
	학과:빅데이터
	학번:4
	학점평균:4.25
	---------------------------
	학생 이름 >> 아이언맨 
	아이언맨, 빅데이터, 4, 4.25
	학생 이름 >> 데드풀
	데드풀, 안드로이드, 2, 3.9
	학생 이름 >> 그만 
	프로그램 종료!
*/
class StudentClass{
	private String name;
	private String major;
	private int year;
	private double gradeAvg;
	
	StudentClass(){}
	StudentClass(String name, String major, int year, double gradeAvg){
		this.name = name;
		this.major = major;
		this.year = year;
		this.gradeAvg = gradeAvg;
	}
	
	public void showInfo() {
		System.out.println(getName() + ", " + getMajor() +
				", "+getYear()+", "+getGradeAvg());
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getYear() {
		return year;
	}

	public double getGradeAvg() {
		return gradeAvg;
	}
	
}
public class UtilEx05 {
	ArrayList<StudentClass> list = new ArrayList<StudentClass>();
	Scanner sc = new Scanner(System.in);
	
	void run() {
		// 학생정보 ArrayList에 저장
		for(int i = 0; i<4; i++) {
			System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
			System.out.print(">> ");
			String str = sc.nextLine();
			String [] arr = str.split(",");
			list.add(new StudentClass(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3])));
		}
		System.out.println("입력 완료!");
		System.out.println("---------------------------");
		// 모든 학생 정보 출력
		Iterator<StudentClass> it = list.iterator();
		StudentClass tmp = new StudentClass();
		while(it.hasNext()) {
			tmp = it.next();
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
				for(int i = 0; i<list.size(); i++) {
					if(list.get(i).getName().equals(str)) {
						list.get(i).showInfo();
					}
				}
			}
			else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		UtilEx05 ex = new UtilEx05();
		ex.run();
		System.out.println("프로그램 종료!");
	}
}
