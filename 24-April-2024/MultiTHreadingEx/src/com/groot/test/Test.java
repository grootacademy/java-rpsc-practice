package com.groot.test;

public class Test {
		public static void main(String[] args) {
			MyThread t1=new MyThread();
			t1.start();
			for(int i=0;i<=10;i++) {
				System.out.println("main Thread "+i);
			}
		}
}
class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread "+i);
		}
	}
}
