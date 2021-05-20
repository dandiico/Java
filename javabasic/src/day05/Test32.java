package day05;

public class Test32 {

	public static void main(String[] args) {
		
		// 반복문 사용시 주의점
		
		// int i는 for문안에서 만들어졌으니, for문 안에서만 유효함
		for(int i=0; i <10; i++) { // 중괄호 안에서 만들어진것 : 지역변수
			System.out.println(i);
		}
		// System.out.println(i); // for문 안에서 썼기 때문에 밖에서는 인식 불가
		System.out.println();
		
		int b = 10;
		for( ; b < 5; b++) { // 초기식 생략가능
			System.out.println(b);
		}
		System.out.println("b : "+ b);
		
		System.out.println();
		
		for(int c=0; c>3; c++) {
			System.out.println("hola");
		}

		for(;;) { // 무한반복가능, but 무한반복은 for문으로 잘안씀
			
		}
	
	
	
	}
	
}
