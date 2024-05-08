package com.groot.test.threadex.usingRunnableInterface;

public class Test {
	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread());
		t1.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("Child thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
