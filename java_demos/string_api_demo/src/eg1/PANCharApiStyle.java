package eg1;

public class PANCharApiStyle {

	public static void main(String[] args) {
		String s="AWSEDS856Y";
		boolean b=false;
		if(s.length()==10 && Character.isUpperCase(s.charAt(9))) {
			int upper=0;
			for (int i = 0; i < 5; i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
			}
			if(upper==5) {
				int digit=0;
				for (int i = 5; i < 9; i++) {
					if(Character.isDigit(s.charAt(i))) {
						digit++;
					}
				}
				if(digit==4) {
					b=true;
				}
			}
		}
		
		if(b) {
			System.out.println("Pan Validated");
		}else {
			System.out.println("Invalid Pan");
		}

	}

}
