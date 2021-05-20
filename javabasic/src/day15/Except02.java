package day15;

public class Except02 {

	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(args[0]);
		/*
		args = new String[3];
		args[0] = "hello";
		 */
		
		try {
		System.out.println(args[0]);
		}catch(Exception e) {
			System.out.println("인수를 입력하고 실행하세요");
			System.out.println(e);
		}
		System.out.println("---------------");

		int number = 100;
		int result = 0;
			for(int i =0; i< 10; i++) {
				//java.lang.ArithmeticException
				try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
				}catch(ArithmeticException e) {
					System.out.println("0으로 나누기 발생");
			} // catch
		} // for
			
		
		
	}

}
