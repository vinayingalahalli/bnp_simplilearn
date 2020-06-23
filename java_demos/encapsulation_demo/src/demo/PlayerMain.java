package demo;

public class PlayerMain {

	public static void main(String[] args) {
		Player player=new Player();
		player.setId(966);
		player.setName("MSD");
		player.printPlayer();
		//player.id=100;
	//player.name="Dinesh";//loosely held 
		//security concerns
		//System.out.println(player.id);
		
		Player p1=new  Player(100, "Dinesh");
		p1.printPlayer();
		p1.setId(9000);
		p1.printPlayer();
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
	}

}
