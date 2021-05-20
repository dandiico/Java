package day11;

public class ClassEx33 {
	
	double d;
	
	ClassEx33(){ // 생성자는 메모리를 차지 하지 않음, 인스턴스랑 사용시기가 같음
		System.out.println("기본생성자");
		d = Math.random();
	}
	// 생성자 오버로딩
	ClassEx33(double a){
		System.out.println("생성자2");
		d = a;
	}
	
	public static void main(String[] args) {
		ClassEx33 c1 = new ClassEx33();
		System.out.println(c1.d);
		ClassEx33 c2 = new ClassEx33(5.12);
		System.out.println(c2.d);
		
	}

}
