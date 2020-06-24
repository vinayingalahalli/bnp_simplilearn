package eg2;

public class Main {

	public static void main(String[] args) {
		Child c=new Implementor();
		c.child1();
		c.parent1();
		
		Parent p=new Implementor();
		p.parent1();
		

	}

}
