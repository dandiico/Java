package day11;
// title, author를 저장할 수 있는 Book3 클래스를 만들고
// 3개짜리 Book3객체 배열을 만들어
// 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하고 출력해보세요.
import java.util.Scanner;

class Book3{
	String title, author;
	
	// 매개변수를 받는 생성자
	Book3(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	void info() {
		System.out.println("제목 : " + title + ", 저자 : "+ author);
	}
	
}

public class ClassEx39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book3 [] books = new Book3[3]; //  3개짜리 Book3객체 배열을 만들기
		
		for(int i = 0; i < books.length; i++) {
			System.out.println("책을 입력하시오");
			String title = sc.nextLine();
			System.out.println("저자를 입력하시오");
			String author = sc.nextLine();
			books[i] = new Book3(title,author); // 객체 생성하여 배열에 저장,넣기
		}
		
		for(int i = 0; i <books.length; i++) {
			System.out.println(books[i].title);
			System.out.println(books[i].author);
			
		}
		for(int i = 0; i <books.length; i++) {
			books[i].info();
		}
		
		sc.close();
	}

}
