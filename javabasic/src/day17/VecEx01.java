package day17;

import java.util.Vector;

public class VecEx01 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(100);
		v.add(1000);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		
		System.out.println("2번 index의 값: " + v.get(2));
		System.out.println("할당된 메모리 용량: " + v.capacity());
		
		v.remove(new Integer(10)); // 요소 10 지우기
		System.out.println(v.size());
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
