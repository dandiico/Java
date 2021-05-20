package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class IterEx02 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(10000);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		} 
								// 반복자는 한번쓰고 버리기 때문에
		it = list.iterator(); // 반복자 다시 얻어서 사용
		
		// 모든 정수를 더한 합 > 반복자 사용
		int tot = 0;
		while(it.hasNext()){
			tot += it.next();
		}
		System.out.println("총합: " + tot);
		
	}

}
