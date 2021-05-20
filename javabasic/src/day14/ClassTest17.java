package day14;
//추상 클래스 
/*
	아래와 같이 4개의 멤버(필드와 메소드)를 가진, 4개의 클래스 Add,Sub,Mul,Div 를 작성하세요. 
	- int타입의 a, b 필드 : 2개의 피연산자 저장할 변수
	- void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
	- int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

	그런데, 각각의 클래스마다 공통된 필드와 메소드가 존재하는 구조이므로, 
	Calc라는 이름의 추상클래스를 작성하여 Calc를 상속받아 각 4개의 클래스를 작성해보세요.
	그리고, main()메소드에서 실행예시와 같이 2개의 정수와 연산자를 입력받은 후,
	4개의 클래스중 적합한 연산을 처리할 수 있는 객체를 생성하고 메서드 호출하여 그 결과 값을 화면에 출력하게 작성 해보세요. 
	실행 예시 :
		두 정수와 연산자를 입력하세요 >> 5 7 +
		12
*/
import java.util.Scanner;
abstract class Calc{ // 추상클래스
	private int a, b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}
class Add extends Calc{
	private int a, b;
	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	int calculate() {
		return a + b;
	}
}
class Sub extends Calc{
	private int a, b;
	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	int calculate() {
		return a * b;
	}
}

class Mul extends Calc{
	private int a, b;
	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	int calculate() {
		return a - b;
	}
}
class Div extends Calc{
	private int a, b;
	
	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	int calculate() {
		return a / b;
	}
	
}
public class ClassTest17 {
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 >>");
		String str = sc.nextLine();
		int [] arr = new int[str.length()];
		for(int i = 0; i<str.length()-1; i++) {
			arr[i] = str.charAt(i);
		}
		int a = arr[0];
		int b = arr[2];
		char operator = str.charAt(str.length()-1);
		
		switch(operator) {
		case ('+'): {
			add.setValue(a,b);
			System.out.println(add.calculate());
			break;
		}
		case ('-'): {
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		}
		case ('*'): {
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		}
		case ('/'): {
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		default: {
			System.out.println("잘못입력 하셨습니다");
			break;
		}
		}
		*/
		
		
		System.out.println("두 정수와 연산자를 입력하세요 >>");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		String operator = sc.nextLine();
		switch(operator) {
		case ("+"): {
			add.setValue(a,b);
			System.out.println(add.calculate());
			break;
		}
		case ("-"): {
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		}
		case ("*"): {
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		}
		case ("/"): {
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		default: {
			System.out.println("잘못입력 하셨습니다");
			break;
		}
		
		}
		
		
		sc.close();
	}
}
