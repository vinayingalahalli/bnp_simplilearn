package eg1;

public interface MyInterface {

	int x=10; //static & final by default
	
	void myMethod1(); //public & abstract by default
	void myMethod2();
	void myMethod3();
	void myMethod4();
	void common();
	
	public interface Inner{
		void inner1();
		void inner2();
		void common();
	}
	
}
