package extending_thread_class_demo;

public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from "+Thread.currentThread().getName()+" i = "+i);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}
