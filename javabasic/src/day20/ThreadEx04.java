package day20;
// Thread 상속
class ThEx01 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(getName()); // 스레드의 이름
		}
		System.out.println("t1 종료");
	}
}
// Runnable 구현
class ThEx02 implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i<5; i++) {
			System.out.println(Thread.currentThread().getName()); //현재 실행중인 Thread
		}
		System.out.println("t2 종료");
	}
}
public class ThreadEx04 {

	
	public static void main(String[] args) {
		ThEx01 t1 = new ThEx01(); // THread 상속
		Runnable r = new ThEx02(); // 다형성, 부모
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		System.out.println("메인 종료");
		
	}

}
