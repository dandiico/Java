package day20;
class ThEx03 extends Thread{
	@Override
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadEx05 {

	public static void main(String[] args) {

		ThEx03 th = new ThEx03();
		th.start();
		System.out.println("종료");
	}
}
