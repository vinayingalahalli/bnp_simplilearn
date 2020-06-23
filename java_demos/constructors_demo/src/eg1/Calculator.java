package eg1;

public class Calculator {
	int a;
	int b;
	public Calculator(String s) {
		System.out.println("Hello " + s);
	}

	public Calculator() {
		System.out.println("public non param constructor");
	}

	public void sayHello() {
		System.out.println("Hello from method");
	}
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	public int sub() {
		return a-b;
	}
	public int multiply() {
		return a*b;
	}
}
