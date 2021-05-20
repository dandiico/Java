package day10;
import java.util.Scanner;
public class ClassEx21 {
	// 재귀호출 : factorial : 1부터 입력받은 수 n 까지 곱한 결과를 돌려주는 메서드
	
	static long factorial(int n) {
		/*
		long result =0; // 결과 담을 변수
		if(n == 1) {
			result = 1;
		}else {
		result = n * factorial(n-1);
		}
		return result;
		*/
		if(n == 1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int n = sc.nextInt();
		factorial(n);
		long result = factorial(n);
		System.out.println(result);
		
		
		
		
		
		sc.close();
	}

}
