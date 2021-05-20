package day19;

// #1. 스레드 클래스 만들기
class TimerThread extends Thread{
	int n = 0;
	// #2. run 메소드 오버라이딩 : 우리가 만드는 일꾼이 할일 정의
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		} // while
	} // run
} // class

public class threadEx01 {

	public static void main(String[] args) {
		// #3. 스레드 객체 생성
		TimerThread th = new TimerThread();
		// #4. 스레드 시작!
		th.start();
		
	}

}
