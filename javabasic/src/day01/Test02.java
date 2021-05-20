package day01;

public class Test02 {
	
	public static void main(String[] args) {
		
		// 변수의 선언
		boolean b;
		char ch;
		int i;
		double d;
		int a, c; // 같은타입의 변수 여러개 선언
		// 변수 선언만하면 사용불가능. !에러!발생
		//System.out.println(b);
		
		// 변수에 값대입
		b = true;
		ch = 'A';
		i = 100;
		d = 1;
		d = 10.2345;
		System.out.println(d); // 출력해서 확인
		
		int abc = 10; // 선언과 동시에 값대입, 변수 선언 + 초기화(변수를 쓰기전에 넣어놓는 것)
		abc = 20; // 초기화는 이쪽에 더 가까움
		System.out.println(abc);
		
		abc = 20 + 100;
		System.out.println(abc);
		
		String str;
		str = "Hello";
		System.out.println(str);
		
	}
}
