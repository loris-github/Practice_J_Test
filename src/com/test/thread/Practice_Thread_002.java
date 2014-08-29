package com.test.thread;

public class Practice_Thread_002 implements Runnable {
	
	public static String str ="默认";

	public void run() {		
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
	
	public void m1(){
		
		str = "百日依山尽";
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void m2(){

		str = "黄河入海流";
		

	}
	
	public static void main(String[] args){
		
		Practice_Thread_002 pt = new Practice_Thread_002();
		Thread t1 = new Thread(pt);
		Thread t2 = new Thread(pt);
		System.out.println("打印开始：");
		t1.start();
		t2.start();
		
		try {
				Thread.sleep(3000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		pt.m1();
		pt.m2();
		
	}

}