package day19;
class ThreadEx extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("run");
		}
	}
}
public class ThreadEx02 {

	public static void main(String[] args) {

		ThreadEx th = new ThreadEx();
		ThreadEx th2 = new ThreadEx();
		th.start(); // 멀티스레드
		th2.start(); // 멀티스레드
		//th.run(); // 싱글스레드
		
		for(int i =0; i<100; i++) {
			System.out.println("mmm");
		}
		System.out.println("main 종료!");
	}

}
