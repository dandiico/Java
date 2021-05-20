package day16;

public class ApiEx04 {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a);
		System.out.println(b);
		if(a == b) System.out.println("a == b");
		if(a.equals(b)) System.out.println("a equals b");
		
		String s1 = "abc"; // 리터럴 형태 / new만들지 않고 다이렉트로 넣는것 / 리터럴 테이블안에 따로 저장됨 / 동일한 문자열인지 비교해서 같은 문자열이 있으면 메모리 공유해서씀
		String s2 = "abc";
		System.out.println(s1);
		System.out.println(s2);
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1 equalse s2");
		}
		
		
	}

}
