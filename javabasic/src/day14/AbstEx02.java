package day14;
// 아래 추상 클래스 Calculator를 상속받은 MyCalc 클래스를 구현하세요
abstract class Calculator {
	public abstract int add(int a, int b); // 두 정수의 합리턴
	public abstract int substract(int a, int b); // 두 정수의 차를 리턴
	public abstract double average(int[] a); // 배열에 저장된 정수의 평균값 리턴
}
// 일반클래스로 상속받아서, 추상메소드 모두 구현시켜서 객체생성후 사용
class MyCalc extends Calculator{
	// 추상메소드 전부 오버라이딩
	public int add(int a, int b) {
		return a+b;
	}
	public int substract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		double avg = (double)tot/a.length;
		return avg;
	}
}
public class AbstEx02 {

	public static void main(String[] args) {
		MyCalc mycalc = new MyCalc();
		//int [] calcArr = new int[]{1,3,5,6,7,};
		System.out.println("두 수의 합: " + mycalc.add(10, 5));
		System.out.println("두 수의 차: " + mycalc.substract(10, 5));
		System.out.println("배열 평균: " + mycalc.average(new int[] {1,2,3,4,5}));

	}

}
