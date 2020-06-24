package eg1;

public class MyClass implements MyInterface,MyInt2,MyInterface.Inner {

	@Override
	public void myMethod1() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface myMethod1() x="+(x));
	}

	@Override
	public void myMethod2() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface myMethod2()");
	}

	@Override
	public void myMethod3() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface myMethod3()");
	}

	@Override
	public void myMethod4() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface myMethod4()");
	}

	@Override
	public void myInt2Method1() {
		// TODO Auto-generated method stub
		System.out.println("MyInt2 myInt2Method1()");
	}

	@Override
	public void myInt2Method2() {
		// TODO Auto-generated method stub
		System.out.println("MyInt2 myInt2Method2()");
	}

	@Override
	public void myInt2Method3() {
		// TODO Auto-generated method stub
		System.out.println("MyInt2 myInt2Method3()");
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("I am common");
	}

	@Override
	public void inner1() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface.Inner inner1()");
	}

	@Override
	public void inner2() {
		// TODO Auto-generated method stub
		System.out.println("MyInterface.Inner inner2()");
	}

}
