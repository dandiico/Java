package Test;
imprt 
import java.util.Scanner;

class Grade{
	private int math, sci, eng;
	Grade(int math, int sci, int eng){
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	}
	int getAvg() {
		return (math+sci+eng) / 3;
	}
}
class Poimt
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("수학, 과학, 영어 점수를 입력하세요.");
        System.out.print("수학>>");
        int math = Integer.parseInt(sc.nextLine());
        System.out.print("과학>>");
        int sci = Integer.parseInt(sc.nextLine());
        System.out.print("영어>>");
        int eng = Integer.parseInt(sc.nextLine());

        Grade me = new Grade(math, sci, eng);

        System.out.println("평균은 "+ me.getAvg());

        sc.close();

	}

}
