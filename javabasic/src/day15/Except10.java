package day15;

public class Except10 {

	public static void main(String[] args) { // 메인도 토스 시킬 수 있음
		try {
		method1();
		}catch(Exception e) {
			System.out.println("main에서 예외 처리");
		}
	}

	static void method1() throws Exception {
		try {
		throw new Exception();
		}catch(Exception e) {
			System.out.println("method1 에서 예외 처리함");
			throw e; // catch안에 또 발생되면 토스
		}
	}
}
