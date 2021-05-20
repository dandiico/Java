package day09;

class Test2 {

	static int a = 10;
	int b = 20;
}

public class ClassEx07 {
	
	static Test2 t = new Test2(); // 클래스변수 : 객체생성후 > 참조변수명.변수명
	
	
	public static void main(String[] args) {
	
		System.out.println(ClassEx07.t.b);
		
		
		
	}

}
