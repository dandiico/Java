package day18;

import java.util.HashMap;
import java.util.Scanner;

/*
 	id와 tel(전화번호)로 구성되는 Student 클래스를 만들고
 	이름을 key로 하고, Student객체를 값으로 하는 해쉬맵을 작성해보세요. // 해쉬맵 임의로 먼저 만들어 놓기
 	이름을 검색하면 id와 전화번호 출력되고 exit 입력하면 프로그램 종료
 */
class Student{
	private String id;
	private String tel;
	Student(String id, String tel){
		this.id = id;
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}
	
	public String getTel() {
		return tel;
	}
	
}
public class HashEx04{

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("아이언맨", new Student("iron","010-1111-1111"));
		map.put("블랙위도우", new Student("black","010-0101-4860"));
		map.put("데드풀", new Student("kill","010-4444-4444"));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름>>");
			String name = sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			Student s = map.get(name);
			if(s == null) System.out.println(name + "은 없는 사람 입니다.");
			else 
			System.out.println("id: " + s.getId() +", " + "tel: " + s.getTel());
			
		}
		
		sc.close();
	}

}
