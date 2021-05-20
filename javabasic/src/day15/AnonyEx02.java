package day15;
class Person{
	void wake() {
		System.out.println("7시 기상");
	}
}
class Anony{
	// 초기값으로 대입 : Person 객체 상속받은 자식 클래스를 정의(오버라이딩)+객체 생성해서 대입
	Person P = new Person() { // P는 인스턴스 변수, 상속받아서 만듬, 자식 클래스를 단발성으로 만든 것
		void work() { // 다이렉트로 볼 수 없다
			System.out.println("출근");
		}
		void wake() {
			System.out.println("6시 기상");
			work(); // 이안에서 쓸 것을 따로 빼서 작성(길어져서)
		}
	}; // 여기까지 하나의 명령
	// Anony 인스턴스 메소드
	void func() {
		// 지역변수 값으로 대입
		Person localP = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어나서");
				walk();
			}
		}; // 확장
		// localP는 지역변수이므로 이 메소드 안에서만 유효
		localP.wake();
		//int a = 10;
		//System.out.println(a);
	}
	void func2(Person person) {
		person.wake();
	}
	
	
}
public class AnonyEx02 {

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println("Person 객체 생성 후 메소드 부르기");
		p.wake();
		System.out.println("---------------");;
		
		Anony anony = new Anony();
		System.out.println("필드 초기값으로 대입");
		anony.P.wake();
		System.out.println("---------------");
		
		System.out.println("지역 변수값으로 대입");
		anony.func();
		System.out.println("---------------");

		System.out.println("매개값으로 사용");
		// Anony 클래스에 있는 func2 사용하면서 매개값으로 던져주는 데 그안에 내용을 단발성으로 수정하여 사용
		anony.func2(new Person(){ // 제일 많이 사용 
			void study() {
				System.out.println("공부한다");
			}
			@Override
			void wake() {
				System.out.println("9시 기상");
				study();
			}
		});
		
	}

}
