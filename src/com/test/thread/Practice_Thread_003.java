package com.test.thread;

class myRunner implements Runnable {
	static int tmp;
	int m_t;
	int[] m_lock;
	public myRunner(int t, int[] lock)
	{
		tmp = 0;
		m_t = t;
		m_lock = lock;
	}
	public void run()
	{
		for (int i=0;i<30;++i)
		{
			synchronized(m_lock)
			{
				int a = tmp;
				String tmpStr = "Thread: " + m_t + " " + a;
				System.out.println(tmpStr);
				tmp = a + 1;
			}
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Practice_Thread_003 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lock = new int[0];
		myRunner r1 = new myRunner(1, lock);
		myRunner r2 = new myRunner(2, lock);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
;