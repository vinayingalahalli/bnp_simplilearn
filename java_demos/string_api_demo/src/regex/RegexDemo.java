package regex;

public class RegexDemo {

	public static void main(String[] args) {
		/*
		 * RegEx(Regular Expression) PMA(Pattern Matching Algo)
		 * 
		 * [] - denotes expression
		 * {} - denotes length
		 * ^ - not
		 * [a-z]{5} - any lowercase word of length 5
			[A-Za-z]{3} - any 3 letter word
			[0-9a-z]{4,9} - any lowercase letter with numeric of min length 4 and max length 9
		 *[A-Z]{1,} - min 1 ucase letter is must and max can be any.
		 *[^a-zA-Z] - apart from alphabets anything else is allowed
		 * Symbols - ?,*,+
		 */
		String s="AB67)())*&B1sa12  s lkas   KL;";
		
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", "").length());
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", "").length());
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", "").length());
	}

}
