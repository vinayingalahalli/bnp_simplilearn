package eg1;

public class Main {

	public static void main(String[] args) {

		System.out.println("Accessing Myinterface methods");
		MyInterface mi = new MyClass();
		mi.common();
		mi.myMethod1();
		mi.myMethod2();
		mi.myMethod3();
		System.out.println(mi.hashCode());
		
		System.out.println("\nAccessing MyInt2 methods");
		MyInt2 i2=new MyClass();
		i2.myInt2Method1();
		i2.common();
		System.out.println(i2.hashCode());
		i2.myInt2Method2();
		System.out.println("\nAccessing MyIntterface.Inner methods");
		MyInterface.Inner inner=new MyClass();
		inner.common();
		inner.inner1();
		inner.inner2();
		System.out.println(inner.hashCode());
	}

}
