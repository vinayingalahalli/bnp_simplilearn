package eg;

public class Demo {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("hello");
	System.out.println(sb);
	sb.append(" heyy").append(1222).append(true).append('c').append(12.44555);
	System.out.println(sb);
	sb.insert(1, "JAVA");
	System.out.println(sb);
	sb.delete(4, 7);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	StringBuffer sb1=new StringBuffer("heyy");
	StringBuffer sb2=new StringBuffer("heyy");
	
	System.out.println(sb1.toString().equals(sb2.toString()));

	}

}
