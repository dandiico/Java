package day20;

import javax.swing.JOptionPane;
class ThEx05 extends Thread{
	@Override
	public void run() {
		for(int i = 10; i>0; i--) {
			if(ThreadEx06.inputCheck) return;
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			System.out.println("10초 동안 값이 입력되지 않아 종료합니다");
			System.exit(0); // exit > 종료
	}
}
class ThEx04 extends Thread{
	@Override
	public void run() {
		System.out.println("10초 안에 값을 입력해야 합니다");
		String str = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		ThreadEx06.inputCheck = true;
		System.out.println("입력한 값은 " + str + "입니다.");
	}
}
public class ThreadEx06 {
	static boolean inputCheck = false;

	public static void main(String[] args) {
		ThEx04 inputTh = new ThEx04();
		ThEx05 timeTh = new ThEx05();
		inputTh.start();
		timeTh.start();
		
	}

}
