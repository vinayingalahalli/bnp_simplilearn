package regex;

public class PANWithRegExDemo {

	public static void main(String[] args) {
		String s="AWSED2856Y";
		
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("valid PAN");
		}else {
			System.out.println("Invalid PAN");
		}
	}

}
