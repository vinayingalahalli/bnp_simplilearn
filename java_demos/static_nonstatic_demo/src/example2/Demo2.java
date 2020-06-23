package example2;

public class Demo2 {

	int x=80000;
	int y;
	static int z=99;

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.x=88;
		d1.y=77;
		d1.printValues();
		
		Demo2 d2 = new Demo2();
		d2.printValues();
		
		Demo2 d3 = new Demo2();
		d3.printValues();
		
		z=100000;
		d2.printValues();
		d3.printValues();
		d1.printValues();
		

	}

	public void printValues() {
		System.out.println("x = " + x + " y = " + y + " z = " + z);
	}

}
