package override_objectclass;

public class PlayerMain {

	public static void main(String[] args) {
	
		Player p1=new Player(100, "Sachin");
		System.out.println(p1);
		System.out.println(p1.toString());
		
		Player p2=new Player(102, "Sourav");
		System.out.println(p2);
		
		Player p3=new Player(100, "Sachin");
		
		if(p1.equals(p2)) {
			System.out.println("P1 & P2 are same");
		}else {
			System.out.println("P1 & P2 are not same");
		}
		
		
		if(p1.equals(p3)) {
			System.out.println("P1 & P3 are same");
		}else {
			System.out.println("P1 & P3 are not same");
		}
		
	}

}
