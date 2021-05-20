package day13;

class Person{void func(){System.out.println("funcfunc");}}
class Student extends Person{} // func
class Researcher extends Person{} // func
class Professor extends Researcher{} // func

public class PolyEx03 {
	static void print(Person p) {	// Person p = new Person(); // 부모까지 true로 알려줌 // Object
		if(p instanceof Person) {System.out.println("Person");}
		if(p instanceof Student) {System.out.println("Student");} 
		if(p instanceof Researcher) {System.out.println("Researcher");}
		if(p instanceof Professor) {System.out.println("Professor");}
	}
	
	static void test (Object o) { // test > 전달받은 객체의 func()메소드 호출기능
		if(o instanceof Person) { // o 가 실제 들고 있는 객체가 Person이나 Person의 자식이라면
			Person p = (Person)o; // Person 변수로 형변화해서 다시 담고, (옷을 맞게 입혀주기)
			p.func(); // func()를 알아볼 수 있게되어 사용가능해짐
		}
	}

	
	
	public static void main(String[] args) {
		/*
		 */
		System.out.print("new Person -> ");
		print(new Person());
		System.out.print("new Student -> ");
		print(new Student());
		System.out.print("new Researcher -> ");
		print(new Researcher());
		System.out.print("new Professor -> ");
		print(new Professor());
		System.out.println("----------");
		
		Person p = new Person();
		test(p);
		//test(new Person());
		
		// 다형성 : 부모타입 변수로 자식 객체 담을 수 있다
		//			부모타입 변수로는 부모가 아는 멤버들만 사용가능
		//			온전히 모든 자식 멤버(변수,메소드)를 사용하고 싶으면
		//			자식 변수에 다시 담아줘야 한다 
		//			이때, instanceof  연산자로 형변환 가능한지 체크하고 형변환하기
		//			instanceof 연산자는 자신타입 또는 자신의 자식타입까지 true 리턴해준다
	}
}
