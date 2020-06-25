package eg1;

public class CharAPIDemo {

	public static void main(String[] args) {
		
		String s="AB67)())*&B1sa12  s lkas   KL;";
		int alphaCount=0,upper=0,lower=0,digits=0,alphanum=0,space=0,special=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				alphaCount++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digits++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				space++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("Total Alphabet Count = "+alphaCount);
		System.out.println("Total ucase Count = "+upper);
		System.out.println("Total lcase Count = "+lower);
		System.out.println("Total digits Count = "+digits);
		System.out.println("Total AlphaNumeric Count = "+alphanum);
		System.out.println("Total space Count = "+space);
		System.out.println("Total special count = "+special);
	}

}
