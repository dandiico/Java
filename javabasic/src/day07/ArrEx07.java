package day07;

public class ArrEx07 {

	public static void main(String[] args) {
		
		int [] num = {1,45,32,677,42};
		
		for(int i =0; i<num.length; i++) {
				System.out.println(num[i]);
		}
		
		// forEach, 업그레이드 for
		// for(변수선언 : 배열){변수활용...}
		for(int n :num) { //num길이만큼 반복하고 순서대로 꺼내서 담아줌, 인덱스 번호 쓰고싶으면 일반 for문으로
			System.out.println(n);
		}
		
		String [] str = {"자바","너무","어렵","네요"};
		for(String n:str) {
			System.out.println(n);
		}
	
	
	}

}
