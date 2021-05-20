package day03;

public class Test15 {

	public static void main(String[] args) {
		
		// 증감연산자 : ++ -- : 단독으로 쓸때는 상관없음
		// 전위형 : ++10  ++a : 나먼저 연산
		// 후위형 : 10++ a++ : 가장 나중에,다른거 먼저
		
		int aa = 10;
		System.out.println(aa);
		++aa;
		System.out.println(aa);
		aa++;
		System.out.println(aa);
		--aa;
		System.out.println(aa);
		aa--;
		System.out.println(aa);
		
		int bb = 10;
		System.out.println(++bb); // 1증가하고 b출력
		System.out.println(bb++); // b를 출력하고 1증가
		System.out.println(bb);
		
		// 문제 : 출력 결과를 미리 주석으로 적어보고 실행해서 맞는지 확인
		System.out.println("문제시작");
		
		int i = 5, j = 5;
		System.out.println(i++); // 5
		System.out.println(++j); // 6
		System.out.println("i=" + i + ", j=" + j); // i=5, j=6 // 틀림 i는 이후에 1증가
		
		int k = 10;
		System.out.println(k++); // 10 출력후 11
		System.out.println(++k); // 12
		++k; //13
		System.out.println(++k); // 14
		System.out.println(k++); // 14 출력후 15
		System.out.println(k); // 15
		
		System.out.println("_________");
		int a = 10, b = 10, r = ++a + ++b;
		System.out.println(r); // a11 +b11 r=22 b=11 // 22
		r = ++a + b++; // a12 r23 b12
		System.out.println(r); // 23
		r = ++a + a; // 13+13 r26 a13
		System.out.println(r); // 26
		r = ++a + a++; // a14+14 r28 a15
		System.out.println(r); // 28
		r = ++a + ++a; // 16 17 r33 a17
		System.out.println(r); //33
		System.out.println(a);
		
		
		
		
	}

}
