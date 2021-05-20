package day15;

public class Except06 {

	public static void main(String[] args) {

		try {
			throw new RuntimeException();
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e);
		}

		System.out.println("-------------");
		
		try {
			System.out.println("hello");
			throw new Exception("강제로 예외 발생");
			//System.out.println("test");
		}catch(Exception e) {
			System.out.println("에러메서지: " + e.getMessage());
			e.printStackTrace(); // 예외 발생시 뜨는 메세지 다시 출력
		}
	}

}
