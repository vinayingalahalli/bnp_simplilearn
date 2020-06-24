package eg1;

public class MobileV2 extends MobileV1{

	
	public void gaming() {
		System.out.println("Gaming feature from V2");
	}
	
	public void browsing() {
		System.out.println("Browsing feature from V2");
	}
	
	public void socialApp() {
		System.out.println("social n/wing app from V2");
	}
	
	@Override
	 public void displayMenu() {
		System.out.println("Menu in V2 is updated to GRID view");
	}
}
