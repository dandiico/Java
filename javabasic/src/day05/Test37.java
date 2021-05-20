package day05;

public class Test37 {

	public static void main(String[] args) {
		// 별찍기 // 15번 중간 공백없이 // 17 중간에 별 하나만
		/* *1
		for(int i = 1; i<=5; i++) {
			System.out.println(i + "행 : ***");
		}
		*/
		
		// *2
		/*
		for(int i = 0; i<5; i++) { // 5줄
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//3
		/*
		for(int i = 0; i<5; i++) {
			for(int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//4
		/*
		for(int i=1; i<6; i++) {
			for(int j=i; j<i+5; j++) { // 다섯번 반복해야하니까 +5
					System.out.print(j);
				}
			System.out.println();
		}
		*/
		
		//5
		/*
		for(int i=6; i>1; i--) {
			for(int j=i-1; j<i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		//6
		/*
		for(int i = 0; i<5; i++) { // 5줄
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i<4; i++) {
			for(int j = 4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//풀이2
		/*
		int star = 1;
		boolean toggle = true; // 별이 증가할지 감소하는지 판별
		for(int i=0; i<9; i++) {
			for(int j =0; j<star; j++) {
				System.out.print("*");
			}
			
			if(toggle) star++;
			else star--;
			
			if(star ==5) {
				toggle = false;
			}
			
			System.out.println();
		}
		*/
		
		//7
		/*
		for(int i=0; i<5; i++) { // 5행
			// 공백 반복 4~0
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			// 별 반복 1~5
			for(int k=1; k<i+2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//8
		/*
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//9
		/*
		for(int i=0; i<11; i++){
			if(i<6) {
				for(int j=5; j>i; j--) {
					System.out.print(" ");
				}
				for(int k=1; k<i+2; k++) {
					System.out.print("*");
				}
			}else {
				for(int j=5; j<i; j++) {
					System.out.print(" ");
				}
				for(int k=11; k>i; k--) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		*/	
		
		// 10
		/*
		for(int i=0; i<5; i++){
			for(int j=3; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("별");
			
			
			System.out.println();
		}
		*/
		
		// 16
		
		for(int i=0; i<5; i++); {
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			for(int j=7; j>(i*2)+1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/*
		for(int i = 0; i < tot / 2; i++) {
	         // 늘어나는 별
	         for(int j = 0; j < i+1; j++) {
	            System.out.print("*");
	         }
	         // 줄어드는 공백7 5 3 1
	         for(int j = 0; j < tot - (i+1)*2; j++) {
	            System.out.print(" ");
	         }
	         // 늘어나는 별 
	         for(int j = 0; j < i+1; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      for(int i = 0; i < tot; i++) {
	         System.out.print("*");
	      }
	      System.out.println();
	      for(int i = 0; i < tot/2; i++) {
	         for(int j = 0; j < tot/2-i; j++) {
	            System.out.print("*");
	         }
	         for(int j = 0; j < (i*2)+1; j++) {
	            System.out.print(" ");
	         }
	         for(int j = 0; j < tot/2-i; j++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      */
		
		
		
		
		
		
		
	}

}
