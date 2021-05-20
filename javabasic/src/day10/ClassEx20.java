package day10;

class Circle{
	int redius = 30;
}

public class ClassEx20 {
	
	// 기본형 테스트용 메서드
	static void plus(int num) { // 객체생성안하고 테스트해보기위해 static으로 만듬
		num = num + 1;
		System.out.println("plus num : "+num);
	}
	// 참조형 테스트용 메서드
	static void biggerPizza(Circle pizza) {
		pizza.redius++;
	}
	// 배열용 테스트용 메서드
	static void increase(int[] array) {
		for(int i = 0; i<array.length; i++) {
			array[i]++;
		}
	} 
	
	public static void main(String[] args) {
	
		/* 기본형
		int num = 10;
		plus(num);
		System.out.println("main num : " + num);
		 */
		
		/* 참조형
		Circle pizza = new Circle();
		System.out.println("main pizza radius before : " + pizza.redius);
		biggerPizza(pizza);
		System.out.println("main pizza radius after : " + pizza.redius);
		 */
		
		/*
		// 배열 (참조형)
		 */
		int [] arr = {1,2,3,4,5};
		increase(arr);
		System.out.println("main : ");
		for(int a : arr) {System.out.println(a);}
		
		
		
		
		
		

	}

}
