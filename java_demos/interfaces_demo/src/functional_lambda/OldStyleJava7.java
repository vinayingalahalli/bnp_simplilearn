package functional_lambda;

public class OldStyleJava7 implements Hello {

	public static void main(String[] args) {

		Hello h = new OldStyleJava7();
		h.sayHello();

		Hello h1 = new OldStyleJava71();
		h1.sayHello();

		Hello a = new Hello() {

			@Override
			public void sayHello() {
				System.out.println("hello anonymous1");

			}
		};
		a.sayHello();

		Hello a2 = new Hello() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("hello anonymous2");
			}
		};
		a2.sayHello();
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("helllo hello");
	}

}
