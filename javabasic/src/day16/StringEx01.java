package day16;

public class StringEx01 {

	public static void main(String[] args) {

		// 문자열 연결
		//System.out.println("abcd" + 1 + true + 2.13e-2 + 'E' + "fgh");
		// 2.13 e - 2 > 소수점을 앞으로 두번 더 가기 / + 2 > 소수점이 뒤로 두번 가기
		
		// 객체와 연결
		//System.out.println(new StringEx01() + "입니다"); // tostring
		
		// concat()
		//System.out.println("I Like".concat("Java"));
		// : 리턴타입 - 클래스명 [출처]
		
		/*
		char[] c = {'a','b','c'};
		String s = new String(c);
		System.out.println(s);
		
		 int > String
		int value = 100;
		String strValue = String.valueOf(value);
		String strValue2 = value+"";
		*/
		
		String fullName = "Hello.test.java";
		
		int idx = fullName.lastIndexOf("."); // . 인덱스번호 알려줘
		
		String fileName = fullName.substring(0,idx); // Hello
		String ext = fullName.substring(idx); // .java
		
		System.out.println("파일명 : " + fileName);
		System.out.println("확장자 : " + ext);
		
		
		

		
	}

}
