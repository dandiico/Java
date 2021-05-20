package day05;

public class Test35 {

	public static void main(String[] args) {
		
		// if(){	if(){}}
		// while(){	while(){}}
		// for(){	for(){}}
		// 중첩 반복 : 반복문안에 반복문
		// 2~3개 적당, 너무 많으면 복잡해짐
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				System.out.println(i+","+j);
			}
		}
		

	}

}
