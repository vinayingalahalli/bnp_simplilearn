package eg1;

public class Demo1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		s3=s3.intern();
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s3.equals("heyy"));
		System.out.println(s3.equals("Hello"));
		System.out.println(s3.equals(s1));
		
		System.out.println(s3.equalsIgnoreCase("HEllO"));
		
		System.out.println(s1.endsWith(".com"));
		System.out.println(s1.startsWith("he"));
		
		System.out.println(s1.contains("el"));
		System.out.println(s1.contains("le"));
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char c[]=s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 3));
		
		String s4="  adahsdakjsfh      ";
		System.out.println(s4);
		s4=s4.trim();
		System.out.println(s4);
		
		String s5="hello hi good evening. Ready to jump off";
		
		String s6[]=s5.split(" ");
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i].toUpperCase());
		}
		
		s5=s5.replace(" ", "$");
		System.out.println(s5);

	}

}
