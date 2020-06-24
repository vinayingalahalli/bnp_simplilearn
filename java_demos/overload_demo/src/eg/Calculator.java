package eg;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("(int,int) is called result is "+(a+b));
	}
	public void add(long a, long b) {
		System.out.println("(long,long) is called result is "+(a+b));
	}
	
	public int add(int x,int z,int y) {
		System.out.println("(int,int,int) is called result is ");
		return x+y+z;
	}
	
	public float add(float a,int b) {
		System.out.println("(float,int) is called result is ");
		return a+b;
	}
	
	public float add(int a,float b) {
		System.out.println("(int,float) is called result is ");
		return a+b;
	}
}
