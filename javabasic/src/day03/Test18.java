package day03;

public class Test18 {

	public static void main(String[] args) {
		
		// 비교연산자 > >= < <= == != : true / false의 결과가 나옴
		int a = 10;
		int b = 0;
		
		// 논리연산자 : 비교 연삭식을 여러개 연결할때 사용
		// && : and : 둘중에 하나라도 거짓이면 거짓, 모두 참이여야 참
		// || : or : 둘중에 하나라도 참이면 참, 모두 거짓이여야 거짓
		boolean res = a < b || b > 0;
		System.out.println(res);
		
		// ! : not : 부정문 : 결과를 반대로 바꿔줌 true > false, false > true
		int c = 10;
		int d = 30;
		boolean ress = c > d;
		System.out.println("res : " + !ress);
		
		res = c > d && d>= 30;
		System.out.println(!res); // T 저장된건 아니고 출력만 되는것임 res 그대로 F
		// res = !res; 이렇게 따로 저장해야함
		System.out.println(res); // F 
		
		// 삼항연산자 : 조건식(비교식) ? 참일때 결과값 : 거짓일때 결과값;
		int e = 10;
		int f = 5;
		String result = e < f ? "크다" : "작다";
		System.out.println(result);
		
		int result2 = e < f ? 1 : 0;
		System.out.println(result2);
		
		char result3 = e > f ? 'o' : 'x';
		System.out.println(result3);
		
		int result4 = e > f ? e : f; // 삼항연산자로 큰수 찾기
		System.out.println(result4);
		
		
	}

}
