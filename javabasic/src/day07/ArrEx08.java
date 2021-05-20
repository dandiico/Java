package day07;
import java.util.Scanner;
public class ArrEx08 {

	public static void main(String[] args) {
		// 문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
	      /*
	         10   20   30
	         40   50   60
	         70   80   90
	      */
		/*
	    // 3행 3열
		int [][] arr = {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
					System.out.print("\t");
			}
			System.out.println();
		}
		*/	
		
	    // 문제2. int형 3행 2열의 정방배열을 만들고
	    //      각 방에 정수를 입력받아 저장하고 출력하세요. 
		
		/*
		Scanner sc = new Scanner(System.in);
		// 3행 2열 정방배열 만들기
	    int [][]arr = new int[3][2];
	    // 각 방에 정수 입력받기
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++) {
	    		System.out.println("정수 입력 >>");
	    		int num = sc.nextInt();
	    		arr[i][j] = num;
	    	}
	    }
	    
	    for(int i = 0; i<arr.length; i++) {
	    	for(int j =0; j<arr[i].length; j++) {
	    		  System.out.print(arr[i][j]);
	    		  System.out.print("\t");
	    	}
	    	System.out.println();
	    }
	    */
	    
	    // 문제3. 아래와 같은 형태의 비정방배열을 만들어 
	    //      아래와 동일하게 값을 저장하고 출력하세요.
	    /*
	       10   11   12
	       20   21
	       30   31   32
	       40   41
	    */
	    // 비정방배열 만들기, 4행 ?열>열은 행마다 다름
	    /*
	    int [][] arr = {{10,11,12},{20,21},{30,31,32},{40,41}}; // 생성과 함께 초기화
	    
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=0; j<arr[i].length; j++){
	    		System.out.print(arr[i][j]);
	    		System.out.print("\t");
	    	}
	    	System.out.println();
	    }
	    */
	    
	    //문제4. 한층에 5호씩 있는 3층짜리 아파트가 있다. > 3행 5열
		/*
		101,102,103,104,105
		201,202,203,204,205
		....
		*/
		
	    // 1) 배열로 만들어서 각 호마다 관리비를 입력받고, 전체 출력해보세요.
		Scanner sc = new Scanner(System.in);
	    /* 거꾸로 마지막 행부터 입력받기
	    int [][]apt = new int[3][5];
	    for(int i=apt.length-1; i>=0; i--) {
	    	for(int j=0; j<apt[i].length; j++) {
	    		System.out.println("관리비를 입력하시오");
	    		apt[i][j]=sc.nextInt();
	    		
	    	}
	    }
	    */
		/**/
		int[][] fee = new int[3][5];
		for(int i =0; i<fee.length; i++) {
			for(int j=0; j<fee[i].length; j++) {
				System.out.println("관리비를 입력하시오");
				fee[i][j]=sc.nextInt();
			}
		}
		
	    // 입력받은 관리비 전체 출력
	    for(int i=0; i<fee.length; i++) {
	    	for(int j=0; j<fee[i].length; j++) {
	    		System.out.print(fee[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
        // 2) 층별 관리비 평균을 구해서 출력해보세요.
		/*
		double [] total = new double[3];
	    double [] avg = new double [3];
	    
	    for(int i=0; i<fee.length; i++) {
	    	for(int j=0; j<fee[i].length; j++) {
	    		total[i] += fee[i][j];
	    			avg[i] = total[i]/fee[i].length;
	    	}
	    }
	    
	    for(int i=0; i<fee.length; i++) {
			System.out.println((i+1)+"층 관리비 평균"+avg[i]);
			System.out.println((i+1)+"층 관리비 총합"+total[i]);
			
		}
	    */
	    
		// 3) 전체 관리비 평균을 구해서 출력해보세요.
	    /*
		// 전체 관리비 저장해줄 총합 변수 만들기
		int totalAll = 0;
		// 0,0부터 전체 for문 돌려 total 변수에 더해주면 끝~
		for(int i=0; i<fee.length; i++) {
			for(int j=0; j<fee[i].length; j++) {
				totalAll += fee[i][j];
		    }
		 }
		double avgAll = totalAlㅣ/(fee.length*fee[0].length);
		
		
		System.out.println("전체 관리비 총합 : " + totalAll);
		System.out.println("전체 관리비 평균 : " + avgAll);
		*/
		/*
		int totalAll = 0;
		for(int i =0; i<total.length; i++) {
				totalAll += total[i];
		}
		*/
		/*
		System.out.println("전체 관리비 총합"+ totalAll);
		System.out.println("전체 관리비 평균"+ avgAll);
		*/
		
		// 4) 103호와 203호의 관리비가 서로 바뀌었다고해요, 교환해주세요.
		/*
		System.out.println("103호 관리비 : " + fee[0][2]);
		System.out.println("203호 관리비 : " + fee[1][2]);
		
		int tmp = fee[0][2];
		fee[0][2] = fee[1][2];
		fee[1][2] = tmp;
		
		System.out.println("103호 관리비 : " + fee[0][2]);
		System.out.println("203호 관리비 : " + fee[1][2]);
		*/
		
	    // 5) 전체 관리비 평균보다 적게 사용한 호수들을 출력해보세요.
		/*
		for(int i =0; i<fee.length; i++) {
			for(int j=0; j<fee[i].length; j++) {
				if(avgAll>fee[i][j]) {
					System.out.println((i+1)+"0"+(j+1)+"호");
				}
			}
		}
		*/
		/*
		for(int i =0; i<fee.length; i++) {
			for(int j=0; j<fee[i].length; j++) {
				if(avgAll>fee[i][j]) {
					System.out.println((i+1)+"0"+(j+1)+"호");
				}
			}
		}
		*/
		
		// 6) 관리비를 가장 적게 사용한 호수와 가장 많이 사용한 호수를 출력해보세요.
	    /*
	    int max = 0; // 비교해서 큰 값 넣어 놓을 변수 생성, 관리비 - 나올일은 없으니 값은 0 넣어줌
	    int maxFloor = 0;  // 큰 값의 층 넣어 놓을 변수 생성
	    int maxRoom= 0;		// 큰 값의 호수 넣어 놓을 변수 생성
	    int min = fee[0][0]; // 비교해서 작은 값 넣어 놓을 변수 생성, 첫번째부터 차례로 비교할거니까 첫번째행열의 값으로 넣어줌
	    int minFloor = 0; // 작은 값의 층 넣어 놓을 변수 생성
	    int minRoom= 0; // 작은 값의 호수 넣어 놓을 변수 생성
	    
	    // 관리비가 제일 많은것 찾기
	    for(int i =0; i<fee.length; i++) {
	    	for(int j = 0; j<fee[i].length; j++) {
	    		if(fee[i][j]>max) {
	    			max = fee[i][j] ;
	    			maxFloor = i+1;
	   				maxRoom = j+1;
	   			}
	   		}
	   	}
    	// 관리비가 제일 적은것 찾기
	   	for(int i =0; i<fee.length; i++) {
	   		for(int j = 0; j<fee[i].length; j++) {
	    		if(fee[i][j]<min) {
	    			min = fee[i][j];
	   				minFloor = i+1;
	   				minRoom = j+1;
	   			}
	   		}
    	}
	    if(fee[0][0]==min) { // 맨 첫번째 행열의 값이 제일 작은 수일 경우 층,호수 변수에 넣어주기
	    	minFloor = 1;	// (0,0) 처음에 넣어둔 값이 제일 작으면 위에 for문이 한번도 실행되지 않아기 때문에
			minRoom = 1;
	    }
	    		
		System.out.println("가장 많이 사용 :"+maxFloor+"0"+maxRoom);
		System.out.println("가장 적게 사용 :"+minFloor+"0"+minRoom);
		*/
		// 풀이
	    int max = fee[0][0];
	    int min = fee[0][0];
	    
	    // 관리비가 제일 큰것 찾기
	    for(int i =0; i<fee.length; i++) {
    		for(int j = 0; j<fee[i].length; j++) {
    			if(fee[i][j]>max) {
    				max = fee[i][j] ;
    			}
    		}
    	}
    	// 관리비가 제일 적은것 찾기
    	for(int i =0; i<fee.length; i++) {
    		for(int j = 0; j<fee[i].length; j++) {
    			if(fee[i][j]<min) {
    				min = fee[i][j];
    			}
    		}
    	}
    	System.out.println("관리비 제일 많은 값 " + max);
	    // 관리비 제일 많이쓴 곳 동호수 찾아서 출력
    	for(int i=0; i<fee.length; i++) {
    		for(int j=0; j<fee.length; j++) {
    			if(fee[i][j]==max){
    				System.out.println("가장 많이 사용 :"+(i+1)+"0"+(j+1));
    			}
    		}
    	}
		// 관리비 제일 적게쓴 곳 동호수 찾아서 출력
		for(int i=0; i<fee.length; i++) {
			for(int j=0; j<fee.length; j++) {
				if(fee[i][j]==min){
					System.out.println("가장 적게 사용 :"+(i+1)+"0"+(j+1));
				}
			}
		}
		
	    // 7) 심화: 관리비 적게 나온 순으로 정렬해보세요. 
	    // hint : 2차원배열에 있는걸 1차원배열에 넣어놓고 비교
		/*
		int [] fee1 = new int[15];
		int [] ho1 = new int[15];

		for(int i=0; i<fee.length; i++) {
			for(int j=0; j<fee[i].length; j++) {
				int idx = (i*5) + j;
				fee1[idx] = fee[i][j];
				ho1[idx] = ho[i][j];
				}
			}
		
	
		for(int f : fee1) {
			System.out.println(f);
		}
		
		for(int i=0; i<fee1.length; i++) {
			for(int j=0; j<fee1.length; j++) {
				if(fee1[i]>fee1[j]) {
					int tmp = fee1[i];
					fee1[i] = fee1[j];
					fee1[j] = tmp;
					int hoTmp = ho1[i];
					ho1[i] = ho1[j];
					ho1[j] = hoTmp;
				}
				}
			}
		for(int i=0; i<fee1.length; i++) {
			System.out.println(fee1[i] + "원, "+ i + "호");
		}
		*/
		
		
	    
	    sc.close();
	}

}
