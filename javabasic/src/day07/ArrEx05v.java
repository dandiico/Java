package day07;
import java.util.Scanner;
public class ArrEx05v {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1-1 arr이라는 이름의 하나의 배열에 사용자로부터 서로 다른 5개의
		//			정수를 입력받아 저장해보고 출력
		/*
		
		int [] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("정수 입력 >>");
			int num = sc.nextInt();
			arr[i] =num;
		}
		
		
		System.out.println("문제1-1 출력 확인");
		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		// 문제1-2 위에서 만든 배열 arr에 저장된 값들을 오름차순으로 정렬하여 출력
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr [j] = arr[i];
					arr [i] = tmp;
				}
			}
		}
		System.out.println("문제1-2 출력 확인");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		// 문제1-3 정수 한개를 더 입력받아 저장하기
		//		입력받은 정수는 기존 배열의 마지막 데이터 다음방에 저장되어야한다.
		//		단, 배열은 문법적으로 방크기 수정이 불가하고,
		//		데이터 하나더 추가되려면 방이 6개여야한다.
		/*
		int []arr = {1,2,3,4,5};
		
		int []tmp = new int[6];
		tmp = arr;
		
		System.out.println("정수 추가 입력 >>");
		tmp[4] = sc.nextInt();
		System.out.println("문제1-3 출력 확인");
		for(int i = 0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
		
		System.out.println("정수 추가 입력 >>");
		int newNum = sc.nextInt();
		// arr을 잠시 복사를 해두고 > 주소값 복사 (레퍼런스 공유)
		int [] tmp = arr;
		// arr을 다시 방 6개로 할당해주고
		arr = new int[6];
		// 복사해둔 주소에 있는 변수 값 넣어주기
		for(int i =0; i<tmp.length; i++) {
			arr[i] = tmp[i];
		}
		arr[5] = newNum;
		
		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		*/
		
		// 문제2-1 게임랭킹보드. 5개의 데이터를 저장할 수 있는 users와 scores라는
		//		이름의 배열이 있고, users 배열에는 유저네임, scores 배열에는
		//		게임점수를 입력받아 저장한다.
		//		단, 유저 네임과 게임점수는 배열 인덱스상 서로 일치한다.
		//		ex) users 첫번째방 유저의 점수는 scores첫번째 방에 저장
		
		// 문제2-2 위 저장된 uses와 scores를 아래와 같은 형태로 출력
		// 	콘솔출력예)
		//	user_name		score
		//_________________________
		//	피카츄			87
		//	파이리			24
		//	...
		
		String []users = new String[5];
		int []scores = new int[5];
		/*
		while(true) {
			for(int i=0; i<users.length; i++) {
				System.out.println("유저 이름 입력 >>");
				String user = sc.nextLine();
				users[i] = user;
				System.out.println("점수 입력");
				int score = Integer.parseInt(sc.nextLine());
				scores[i] = score;
			}
		break;
		}
		System.out.println("user_name\tscore");
		System.out.println("_________________________");
		for(int i=0; i<users.length; i++) {
			System.out.print(users[i]+"\t\t"+scores[i]);
			System.out.println();
		}
		*/
		
		
		
		// 문제2-3 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌어서 저장이
		// 		되었다고 합니다. 두개의 점수만 교환해주세요.
		/*
		int tmp;
		tmp = scores[1];
		scores[1] = scores[2];
		scores[2] = tmp;
		
		
		System.out.println("user_name\tscore");
		System.out.println("_________________________");
		for(int i=0; i<users.length; i++) {
			System.out.print(users[i]+"\t\t"+scores[i]);
			System.out.println();
		}
		*/
		
		//	문제2-4 점수가 높은순으로 출력되는 게임 랭킹보드를 출력하세요
		//		랭킹 보드는 1위~5위까지
		//		rank	user_name	score
		//		_________________________
		//		1		피카츄		87
		//		2		파이리		24
		//		...
		/*
		while(true) {
			for(int i=0; i<users.length; i++) {
				System.out.println("유저 이름 입력 >>");
				String user = sc.nextLine();
				users[i] = user;
				System.out.println("점수 입력");
				int score = Integer.parseInt(sc.nextLine());
				scores[i] = score;
			}
			for(int i =1; i<scores.length; i++) {
				for(int j =1; j<scores.length; j++) {
					if(scores[i] < scores[j]) {
						// 점수 자리 교환
						int tmpScore;
						tmpScore = scores[j];
						scores[j] = scores[i];
						scores[i] = tmpScore;
						// 이름 자리 교환도 동시에
						String tmpUser;
						tmpUser = users[j];
						users[j] = users[i];
						users[i] = tmpUser;
					}
				}
			}
				
		break;
		}
		System.out.println("rank\tuser_name\tscore");
		System.out.println("_________________________");
		for(int i=0; i<users.length; i++) {
			System.out.print((i+1)+users[i]+"\t\t"+scores[i]);
			System.out.println();
		}
		*/
		
		// 문제2-5 또한명의 유저가 게임을 끝냈습니다.
		//		점수와 유저네임을 입력받고, 기존의 게임랭킹보드를 업데이트해
		//		출력해주세요. 이때 입력받은 새로운 유저의 데이터는
		//		기존의 데이터에 추가되어야함 (1-3 문제 참고)
		//		업데이트 방법 : 랭킹은 5위까지만 출력.
		//		새로 입력받은 유저의 점수가 5위보다 낮으면 출력하지 않음
		//		순위권 안에 들어오는 점수면 순위에 맞춰 출력
		
		// 배열 방 크게 만들기
		int len = scores.length; // 배열 기존 길이 담기
		// 두개의 배열 주소 복사해놓기 (레퍼런스 공유)
		int [] scoresTmp = scores;
		String [] userTmp = users;
		// 기존 배열 두개의 공간 6개로 만들기
		scores = new int[len+1];
		users = new String[len+1];
		// 복사해둔 기존 데이터 옮겨담기
		for(int i =0; i<scoresTmp.length; i++) { // Tmp 붙여야함
			scores[i] = scoresTmp[i];
			users[i] = userTmp[i];
		} // 5명은 정렬이 된상태로 다시 복사됐었을것임
		// 새로운 유저의 이름과 점수 입력받아 마지막에 저장
		System.out.println("이름>>");
	    users[len] = sc.nextLine();  // users[5]
	    System.out.println("점수>>");
	    scores[len] = Integer.parseInt(sc.nextLine());
	    // 다시 정렬 
	    for(int i = 0; i < scores.length-1; i++) {
	       for(int j = i+1; j < scores.length; j++) {
	          if(scores[i] < scores[j]) {
	             // 점수 자리 교환
	             int temp = scores[i];
	             scores[i] = scores[j];
	             scores[j] = temp;
	             // 이름 자리 교환도 동시에 
	             String sTmp = users[i]; 
	             users[i] = users[j];
	             users[j] = sTmp;
	          }
	       }
	    }
		
		// 랭킹출력 : 5위까지만 (꼴찌인 6번째는 출력안됨)
		System.out.println("rank\tuser_name\tscore");
		System.out.println("_________________________");
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+users[i]+"\t\t"+scores[i]);
			System.out.println();
		}
		
		
		
	sc.close();
	}

}
