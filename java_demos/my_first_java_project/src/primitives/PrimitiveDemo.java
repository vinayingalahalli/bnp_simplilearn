package primitives;

public class PrimitiveDemo {

	public static void main(String[] args) {
		/*
		 * datatype		size		defaultvalue
		 * byte			1byte			0
		 * short		2bytes			0
		 * int			4bytes			0
		 * long			8bytes			0
		 * 
		 * float		4bytes			0.00000f
		 * double 		8bytes			0.00000d
		 * 
		 * char			2bytes			'\u00000' unicode charset
		 * 
		 * boolean      1bit			false
		 */
		int x = 777;
		System.out.println(x);
		
		float f=9.999f;
		System.out.println(f);
		
		double d=93.333;
		System.out.println(d);
		
		/*
		 * Casting?
		 * implicit - done by compiler (smaller to larger type)
		 * explicit - done by programmer (larger to smaller)
		 */
		
		char c='h';
		x=c;
		System.out.println(x);
		x=200;
		c=(char)x;
		System.out.println(c);
		
		float m=x;
		System.out.println(m);
		m=222.22222222f;
		x=(int)m;
		System.out.println(x);
		
		long h=123;
		
		m=h;
		System.out.println(m);
		
		

	}

}
