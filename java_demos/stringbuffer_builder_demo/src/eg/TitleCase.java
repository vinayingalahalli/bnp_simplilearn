package eg;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hi how are you doing";
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		
		System.out.println(sb.toString().trim());
		

	}

}
//try with last char uppercase