package day10;
/*
 * char[] 배열을 전달 받아 출력하는 printCharArray() 메서드와
 * 배열속의 ''공백문자를, ','쉼표로 대치하는 replaceSpace() 메서드를 작성해보자
 */
public class ClassEx22 {
	// static으로 두개 메서드 작성
	
	// static 클래스로 만들어주는 키워드
	// void 리턴타입 없다. 돌려줄 값 없다. return 키워드 작성 안함
	// char[] c 매개변수, 파라미터, 호출하는 시점에서 char[]을 인자로 줬으니
	// 받아주는 매개변수도 같은 char[]으로 만들고,
	// 이때 이름은 던져준 변수와 받는 변수가 달라도 된다.
	// 매개변수, 인자는 서로 개수와 데이터 타입과 순서가 일치해야한다.
	// 밑에서 char[] 한개 던졌으니 받아주는애도 한개만 일티하게 작성
	static void printCharArray(char[] c) {
		for(int i = 0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}

	static void replasceSpace(char[] c) {
		for(int i = 0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
	}
	
	public static void main(String[] args) {
		
		// c : 배열이 실제 저장되어 있는 메모리주소가 저장되어있다.
		char[] c = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y'};
		// 메서드 호출, main도 클래스메서드, print~ 클래스 메서드 붙은 메서드라서
		// 메모리 생성시점이 동일하므로 바로 이름만불러 호출가능
		// 메모리 언제 생성 ? > 프로그램 시작할때 Method Area 영역에 로딩된다.
		// c를 인자로 던져서 호출 > c는 주소를 가지고 있으니 주소를 전달함
		// 레퍼런스 공유 (주소공유, 다른이름의 배열 변수들이 같은 데이터를 참조한다)
		printCharArray(c); // I am a boy
		replasceSpace(c);
		printCharArray(c); // I,am,a,boy
		
	}

}
