package day18;

import java.util.HashSet;
import java.util.Set;
class Tv{}
public class HashSetEx01 {

	public static void main(String[] args) {

		Object[] obj = {"1",new Integer(1), "2", "2", "3","3","4","4","4"};
		Set set = new HashSet(); // List list = new ArrayList(); Map map = new HashMap(); // 부모꺼로 형변환
		for(int i = 0; i<obj.length; i++) {
			set.add(obj[i]);
		}
		System.out.println(set);
		
		set.add(new Tv());
		set.add(new Tv());
		set.add(new Tv());
		set.add(new Tv());
		System.out.println(set);
		
	}

}
