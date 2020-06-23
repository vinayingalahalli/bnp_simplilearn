package eg1;

public class Main {

	public static void main(String[] args) {
		Calculator c=new Calculator("java");
		c.sayHello();
		
		Calculator c1=new Calculator(10, 200);
		System.out.println(c1.add());
		System.out.println(c1.multiply());
		System.out.println(c1.sub());
		
		System.out.println(c.add());
		
	}

}
