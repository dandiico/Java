package day02;

public class Test06 {

	public static void main(String[] args) {
		
		// 일반 문자열만 출력
		System.out.printf("안녕하세요");
		System.out.printf("반갑습니다");

		// 데이터 출력
		System.out.println(10);
		System.out.printf("정수 출력 : %d", 10);
		System.out.printf("실수 출력 : %f", 1.23);
		System.out.printf("문자 한개 출력 : %c", 'A');
		System.out.printf("문자열 출력 : 안녕\n"); // 변수에 들어있는 데이터 값을 출력하기위해 위에처럼 작성
		
		int i = 100;
		int j = 200;
		String str = "hello";
		System.out.printf("i : %d, j : %s\n", i,str);
		System.out.printf("i : " + i +", str : " + str + "\n");
		
		
		System.out.println("Hello\"java\thello\njiji");
	}

}
