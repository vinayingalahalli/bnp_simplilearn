package extending_thread_class_demo;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		Thread t=Thread.currentThread();
		t.setName("my main");
		t.setPriority(7);
		System.out.println(Thread.currentThread());
		
		MyThread m1=new MyThread();
		m1.setName("mt-1");
		MyThread m5=new MyThread();
		m5.setName("mt-5");
		MyThread m4=new MyThread();
		m4.setName("mt-4");
		MyThread m3=new MyThread();
		m3.setName("mt-3");
		MyThread m2=new MyThread();
		m2.setName("mt-2");
		

		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
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
