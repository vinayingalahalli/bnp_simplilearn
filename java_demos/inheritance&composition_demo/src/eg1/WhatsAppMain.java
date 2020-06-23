package eg1;

public class WhatsAppMain {

	public static void main(String[] args) {
		
		WhatsAppV3 v3=new WhatsAppV3();
		
		System.out.println("Accessing via V3 object");
		v3.voiceCalling();
		v3.textMesssage();
		v3.voiceMessage();
		v3.videoCalling();
		v3.groupMessage();
		v3.groupVideoCall();
		
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());

	}

}
