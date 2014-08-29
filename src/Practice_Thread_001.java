import java.util.*;

public class Practice_Thread_001 {

	public static void main(String[] args) {

		Thread t = null;
		Thread_A ta = new Thread_A();
		t = new Thread(ta);
		
		space(1000);
		printString("马上开始打印！");
		t.start();
		space(5000);
		t.interrupt();

	}
	
	public static void space (long f){
		try {
			Thread.sleep(f);
		} catch (InterruptedException e) {
			System.out.println("+++++++++++擦！被打醒了！+++++++++++++");
		}
	}
	
	public static void printString(String str){
		System.out.println(str);
	}

}

class Thread_A implements Runnable{
	
	@Override
	public void run() {	
		for(int i =1; i<30; i++){
			System.out.println("========= "+ new Date() +" =========");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				System.out.println("擦！被打断了！");
				return;
			}
		}
		System.out.println("打印完成!");

	}
	
}