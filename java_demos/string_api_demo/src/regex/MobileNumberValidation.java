package regex;

public class MobileNumberValidation {

	public static void main(String[] args) {
		String s="+91-1A34567890";
		if(s.matches("\\+91-[0-9]{10}")) {
			System.out.println("Valid mobile number");
		}else {
			System.out.println("Invalid number");
		}

	}

}
