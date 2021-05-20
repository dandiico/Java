package day15;

public class Except04 {

	public static void main(String[] args) {
		
		String [] strNumber = {"23", "25", "213.32","05"};
		int i = 0;
		try {
			for(; i<strNumber.length; i++) {
				int j = Integer.parseInt(strNumber[i]);
				System.out.println("정수로 변환된 값 : " + j);
			}
		}catch(NumberFormatException e) {
			System.out.println(strNumber[i] + "는 정수로 변환할수 없습니다.");
		}
	}

}
