package functional_lambda;
@FunctionalInterface
public interface Hello {

	public void sayHello();
	
}


@FunctionalInterface
 interface HelloAgain{
	public void sayHello(String name);
}

@FunctionalInterface
interface Addition{
	int sum(int a,int b, int c);
}