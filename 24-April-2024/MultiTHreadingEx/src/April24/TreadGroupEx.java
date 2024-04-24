package April24;

public class TreadGroupEx {
		public static void main(String[] args) {
			ThreadGroup threadGroup=new ThreadGroup("Group-A");
			ThreadGroupDemo runnable=new ThreadGroupDemo();
			
			Thread t1=new Thread(threadGroup, runnable, "one");
			t1.start();
			Thread t2=new Thread(threadGroup, runnable, "two");
			t2.start();
			Thread t3=new Thread(threadGroup, runnable, "three");
			t3.start();
			
			System.out.println(threadGroup.getName());
			threadGroup.list();
		}
		
		
}
class ThreadGroupDemo implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}