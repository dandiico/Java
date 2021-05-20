package day11;

class Person{

	// 캡슐화
	private String name;
	private int age;
	
	public String getName() { // getter : 외부에서 name변수의 데이터를 꺼낼때 사용
		return this.name;
	}
	
	public void setName(String name) { // setter : 외부에서 던져준 데이터로 name변수 세팅
		this.name = name;
	}
	
	public int getAge(){ 
		return this.age;
	}
	
	public void setAge(int age) { 
		this.age = age;
	}
	
}

public class ClassEx41 {

	public static void main(String[] args) {

		Person p = new Person();
		// p.name = "피카츄";
		// p.age = 10;
		p.setName("피카츄");
		System.out.println(p.getName());
		p.setAge(10);
		System.out.println(p.getAge());
		
	}

}
