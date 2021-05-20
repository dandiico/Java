package note;

public class Caulculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void excute() {
		double result = avg(7,10);
		print("실행결과" + result);
	}
	
	void print(String message) {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		Caulculator maCalc = new Caulculator();
		maCalc.excute();
	}

}
