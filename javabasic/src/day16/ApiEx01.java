package day16;
class A{}
public class ApiEx01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		A a = new A();
		System.out.println("클래스 이름 : " + a.getClass().getName());
		System.out.println("해쉬코드 : " + Integer.toHexString(a.hashCode()));
		System.out.println("객체 문자열 : " + a.toString()); // 위에두개 골뱅이로 묶어서 줌. 10진수
		
	}

}
