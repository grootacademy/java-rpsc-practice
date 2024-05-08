package April24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Runnable worker=new WorkerThread(""+i);
			executorService.execute(worker);
		}
		executorService.shutdown();
		while(!executorService.isTerminated());
		System.out.println("All thread are finished");
	}
}
class WorkerThread implements Runnable{
	private String message;

	WorkerThread(String message){
		this.message=message;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) message="+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}