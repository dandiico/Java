package day16;

public class SBEx01 {

	public static void main(String[] args) {
		
		// String vs StringBuffer 속도 차이, Buffer가 훨씬 빠름
		long start, end;
		String str = new String("1~10000까지 : ");
		StringBuffer sb = new StringBuffer("1~10000까지 :");
		
		start = System.currentTimeMillis();
		for(int i = 0; i<=10000; i++) { // 문자열 붙이기 만번 반복
			str += i;
			str += "+";
		}
		end = System.currentTimeMillis();
		System.out.println("String :" + (end - start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i<=10000; i++) { 
			sb.append(i);
			sb.append("+");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer :" + (end - start));
		
		
		
		
		
		/*
		StringBuffer sb = new StringBuffer("sunny");
		sb.insert(2, "hahaha");
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		*/
		
		//StringBuffer sb2 = new StringBuffer(" day");
		//System.out.println(sb.equals(sb2));
		// StringBuffer의 equalse()는 오버라이딩 되지 않아서 Object의 날것 그대로 사용
		/*
		StringBuffer sb3 = sb.append(sb2);
		System.out.println(sb3);
		
		sb.append("hello"); // 바로 수정
		System.out.println(sb);
		*/
		
		/*
		int s = sb.capacity();
		System.out.println(s);
		int len = sb.length();
		System.out.println(len);
		*/
	}

}
