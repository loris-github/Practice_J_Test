package com.test.thread;

class Deadlock1 extends Thread
{
	public void run()
	{
		synchronized(DeadLock.lock1){
			System.out.println("Way1.step1");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(DeadLock.lock2){
				System.out.println("Way1.step2");
			}
		}
	}
}

class Deadlock2 extends Thread
{
	public void run()
	{
		synchronized(DeadLock.lock2){
			System.out.println("Way2.step1");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(DeadLock.lock1){
				System.out.println("Way2.step2");
			}
		}
	}
}

public class DeadLock  {

	static byte[] lock1 = new byte[0];
	static byte[] lock2 = new byte[0];	
	
	public static void main(String[] args) {
		Deadlock1 dl1 = new Deadlock1();
		Deadlock2 dl2 = new Deadlock2();
		
		Thread t1 = new Thread(dl1);
		Thread t2 = new Thread(dl2);
		t1.start();
		t2.start();
		
	}
}

