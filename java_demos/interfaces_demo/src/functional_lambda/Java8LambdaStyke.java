package functional_lambda;

public class Java8LambdaStyke {

	public static void main(String[] args) {
		
		Hello h=()->{
			System.out.println("Hello lambda style ");
		};
		h.sayHello();
		
		Hello h1=()->{
			System.out.println("Lambda again again");
		};
		h1.sayHello();
		
		HelloAgain ha=(s)->{
			System.out.println("Hello "+s);
		};
		
		ha.sayHello("Awesome");
		
		
		Addition a=(x,y,z)->{
			return x+y+z;
		};
		
		System.out.println(a.sum(2323, 23, 3434));

	}

}
