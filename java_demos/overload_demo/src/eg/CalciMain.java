package eg;

public class CalciMain {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		
		c.add(10, 22);
		
		System.out.println(c.add(23.4f, 22));
		
		
		c.add(6666L, 888888L);
		
		System.out.println(c.add(999, 99, 9));
	}

}
