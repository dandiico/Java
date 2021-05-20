package day15;

public class Except07 {

	public static void main(String[] args) {

		try {
			System.out.println("try 구문");
			//throw new Exception("hello");
			throw new RuntimeException();
		}catch(NullPointerException e) {
			System.out.println("null");
		}catch(Exception e) { // 제일 부모 이기 때문에 다들 여기로 옴 예외처리 발생시, 맨마지막에 와야함
			System.out.println("모든 예외");
		}//catch(RuntimeException e) {
			//System.out.println("Runtime");
	}

}
