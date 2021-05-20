package day16;

public class WrapperEx04 {

	public static void main(String[] args) {
		
		// int < Integer : 언박싱
		int i = new Integer(10) * 20;
		System.out.println(i);
		
		// Integer < int : 박싱
		int ii = 200;
		Integer iii = ii + 100;
		System.out.println(iii);
		
		
	}

}
