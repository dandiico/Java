package day07;
import java.util.Scanner;
public class Day06Ex {

	public static void main(String[] args) {
		
		// 문제1-1 arr이라는 이름의 하나의 배열에 사용자로부터 서로 다른 5개의 정수를 입력받아 저장해보고 출력
		Scanner sc = new Scanner(System.in); // 입력 받아야 하니 Scanner 입력문 생성
		/*
		int [] arr = new int[5]; // 5개의 방을 가진 변수 arr 배열 생성
		
		
		// 입력받은 정수를 배열에 차곡차곡 넣기 > for문 돌려돌려
		for(int i=0; i<arr.length; i++) { // 인덱스 번호는 0부터 시작하니까 i는 0, 길이는 방의개수로 인덱스 번호+1
			System.out.println("정수 입력 >>"); // 정수 입력하라고 메세지 띄우기
			arr[i]=sc.nextInt(); // 입력 받은 정수를 바로 arr 배열 i번째에 넣어버리기~! 입력하고 넣고 입력하고 넣고 반복문 완.
		}
		
		/*
		// 잘 넣어졌는지 확인해봅시다.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 잘넣었군요 짝짝짝
		*/
		
		// 문제1-2 위에서 만든 배열 arr에 저장된 값들을 오름차순(작은것>큰것 순)으로 정렬하여 출력
		// 작은수부터 큰수까지 쭈루룩 정렬해야 한다? 값끼리 하나하나 전부 비교해야함! 그럼 뭐다? for문 돌려라x2
		// why? 두번 돌리냐! 1-(2,3,4,5) 비교하고 2-(3,4,5) 비교해야 하니까 for문안에 for문을 써서 휘리릭 돌리면 됨
		// 그리고 값을 비교해야한다! 그럼? *if*를 사용하여 작은 값을 비교하고 넣고 비교하고 넣고 하면 끝!
		/*
		for(int i =0; i<arr.length-1; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		// 잘 넣어졌는지 확인해봅시다.
		for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		}
		*/
		// 와 갑자기 오류가 사라짐 분명 큰것부터 출력됐는데 피곤해서 헛것본건가 아닌데;;;;뭘까;;;내일 다시 돌려본다.
		
		// 문제1-3 정수 한개를 더 입력받아 저장하기
		// 입력받은 정수는 기존 배열의 마지막 데이터 다음방에 저장되어야한다.
		// 단, 배열은 문법적으로 방크기 수정이 불가하고,
		// 데이터 하나더 추가되려면 방이 6개여야한다.
		// !방크기 수정이 불가! arr의 값을 > 새로운 배열 만들어 보관하고(주소값 공유) > arr6개로 늘리고 > 공유했던 주소값 다시 집어 넣기
		
		
		int [] arr = {1,2,3,4,5};
		int [] tmp = arr;
		arr = new int[6];
		for(int i =0; i<tmp.length; i++) {
			arr[i]=tmp[i];
		}
		for(int i =tmp.length; i<arr.length; i++) {
			System.out.println("정수 추가 입력");
			arr[i] = sc.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		sc.close();
	}

}
