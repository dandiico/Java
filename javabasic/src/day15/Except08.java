package day15;

public class Except08 {
	/* 정석으로 예외처리 방법
	static void add() {
		try {
			Exception e = new Exception();
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	static void add() throws Exception { // 메소드 안에서 예외가 발생하면 메소드 호출한 쪽으로 예외처리 미루기
										// 여기서 해결하지 않고 부르는 사람이 해결하렴~^^
		Exception e = new Exception(); // 나올 수 있는 에러들 같이 작성 가능
		throw e;
	}
	public static void main(String[] args) {
		try {
		add();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}

}
