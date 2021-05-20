package note;

public class note2 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}

}
