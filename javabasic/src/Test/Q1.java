package Test;

public class Q1 {

	public static void main(String[] args) {

		int [] arr = {10,20,30,40,50};
		
		for(int i = 0; i <arr.length-1; i++) {
			for(int j = 0+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
				
		for(int j =0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}


		
	}
}
