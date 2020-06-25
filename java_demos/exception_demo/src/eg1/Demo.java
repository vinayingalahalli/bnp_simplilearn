package eg1;

public class Demo {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int res=0;
		
		try {
		res=a/b;
		String s=null;
		s.length();
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero "+e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Something is empty or null");
		}
		
		finally {
			System.out.println("Result is "+res);
		}
		
//		catch(Exception e) {
//			
//		}
//		
		System.out.println("This is other lines of code of the app");
		

	}

}
