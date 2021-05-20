package day12;
class Calc {
	// 클래스 메서드 : 클래스명.메서드명
	public static int sum(int a, int b) { return a + b;}
	public static int mul(int a, int b) { return a * b;}
	public static int abs(int a) {return a > 0 ? a : -a;};
	
}
public class ClassFinal02 {

	public static void main(String[] args) {
		
		System.out.println(Calc.sum(10,10));
		System.out.println(Calc.mul(10, 20));
		System.out.println(Calc.abs(-100));
		
		
	}

}
