package day02;

public class Test00 {

	public static void main(String[] args) {
		
		double d = 1.1254867;
		System.out.printf("%.5f\n", d); // 소수점 다섯자리까지 출력
		String dstr = String.format("%.4f\n", d);
		System.out.println(dstr); // 문자열로 변경해서 println로 출력, 출력문은 개발자 확인용
		
		
	}

}