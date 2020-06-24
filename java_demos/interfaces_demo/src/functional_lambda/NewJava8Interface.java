package functional_lambda;

@FunctionalInterface
public interface NewJava8Interface {

	default void iAmDefault() {
		System.out.println("This is default implementation of method");
		System.out.println("from the Java8 and above");
		
	}
	
	public static void iAmStatic() {
		System.out.println("Hello static in interface from Java8");
	}
	void hello();
}
