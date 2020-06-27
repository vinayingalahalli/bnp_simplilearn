package extending_runnable_demo;

public class RunMain {

	public static void main(String[] args) {
		
		RunThread r1=new RunThread();
		Thread t1=new Thread(r1, "run-1");
		RunThread r2=new RunThread();
		Thread t2=new Thread(r2, "run-2");
		RunThread r3=new RunThread();
		Thread t3=new Thread(r3, "run-3");
		RunThread r4=new RunThread();
		Thread t4=new Thread(r4, "run-4");
		RunThread r5=new RunThread();
		Thread t5=new Thread(r5, "run-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main ends here");
	}

}
