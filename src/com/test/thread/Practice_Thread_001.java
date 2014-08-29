package com.test.thread;
import java.util.*;
/*
1.练习线程的使用
2.一个实现了Runnable 接口的类 要想实现打断，最好外边套一个Thread以便方法interrupt()调用

*/
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