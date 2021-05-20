package day11;

class Book2{
	String title = "";
	String author = "";
	
	Book2(){
		this("무제","작자미상");
		System.out.println("생성자 호출");
	}
	
	Book2(String title){
		this(title,"작자미상"); // (String, String) 형태의 생성자를 호출
		System.out.println("생성자2 호출");
		//this.title = title;
		//this.author = "작자미상";
	}
	
	Book2(String title, String author){
		System.out.println("생성자3 호출");
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + " " +author);
	}
	/*
	static void test() { 
		this.title = "hello"; // new한 애들만 사용 가능
	}
	*/
	
}

public class ClassEx37 {

	public static void main(String[] args) {
		
		Book2 b = new Book2();
		b.show();
		
	}

}
