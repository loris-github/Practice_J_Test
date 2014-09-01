package com.test.thread;

public class Practice_Thread_002 implements Runnable {
	
	public static String str ="默认";

	public void run() {
		System.out.println("The NUM is :"+Practice_Thread_002.str);

		m1();
		
		for(int i = 0;i<20;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("The NUM is :"+Practice_Thread_002.str);
			}

		System.out.print("打印结束");
	}
	
	public  void m1(){
		
		try {
			Thread.sleep(2000);
	} catch (InterruptedException e) {
			e.printStackTrace();
	}
		
		str = "百日依山尽";

	}
	
	public  void m2(){

		str = "黄河入海流";
		
	}
	
	public static void main(String[] args) {
		
		Practice_Thread_002 pt = new Practice_Thread_002();
		Thread t1 = new Thread(pt);
		System.out.println("打印开始：");
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 这里睡一秒保证m1()先执行
		System.out.println(Practice_Thread_002.str);
		
		pt.m2();
		System.out.println(Practice_Thread_002.str);
		
	}

}