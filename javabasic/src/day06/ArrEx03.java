package day06;

public class ArrEx03 {

	public static void main(String[] args) { // 프로그램 시작할때 시작시점
		
		int [] arr = {1,2,3,4,5}; // heap메모리 접근가능
		int [] myArr = arr;
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		System.out.println(arr);
		System.out.println(myArr);

	}

}
