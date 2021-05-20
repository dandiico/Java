package day15;

public class Except09 {

	public static void main(String[] args) {
		try {
		method1();
		}catch(Exception e) {
			System.out.println("처리");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception { // 부른쪽으로 계속해서 떠넘기기
		method2();
	}
	static void method2() throws Exception { // 부른쪽으로 계속해서 떠넘기기
		throw new Exception();
	}

}
