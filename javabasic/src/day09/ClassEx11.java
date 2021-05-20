package day09;
// 계산기 클래스 : 입력값(두개), 리턴값 모두 있는 형태
class Calc{
	// 덧셈 sum, 뺄샘 sub, 곱셈 mul, 나누셈 div
	int sum(int a, int b) {
		return a +b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	double div(int a, int b) {
		if(b == 0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0.0;
		}else {
			return (double)a / b;
		}
	}
	
}

public class ClassEx11 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		System.out.println("나누기 : " + calc.div(10, 20)); // 어디에다 가져다 쓸거라면 변수에 넣기
		System.out.println("더하기 : " + calc.sum(10, 2));
		System.out.println("곱하기 : " + calc.mul(10, 2));
		System.out.println("빼기 : " + calc.sub(10, 2));
	
	}

	


}
