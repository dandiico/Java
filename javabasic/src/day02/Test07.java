package day02;

public class Test07 {

	public static void main(String[] args) {
		
		// 문제. 정수형 변수 a,b를 만들고
		//	각각 10, 20을 대입하고,
		//	값을 서로 교환해서 출력해보새요.

		int a, b;
		a = 10;
		b = 20;
		System.out.println(a + " " + b);
		int tmp = a; // 임시 변수 tmp의 값을 잠시 저장해놓고
		a = b; // b에 있던 값을 a에 넣고
		b = tmp; // tmp에 저장해 놨던 a값을 b에 덮어쓰기
		System.out.println(a + " " + b);
				
	}

}
