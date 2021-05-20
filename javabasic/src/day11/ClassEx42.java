package day11;
// 캡슐화 활용
class Person1{
	private int age = 10;
	
	public void setAge(int age) {
		if(age > 0 && age < 130) { // age의 값이 0이상 130 이상일시 값저장
		this.age = age;
		} else {	// 아닐시 아래 출력문 출력
			System.out.println("나이를 잘못 입력하셨습니다");
		}
	}
	public int getAge() {
		return age;
	}
}

public class ClassEx42 {

	public static void main(String[] args) {

		Person1 p = new Person1();
		p.setAge(30);
		System.out.println("나이는 : " + p.getAge() + "살 입니다.");
	}

}
