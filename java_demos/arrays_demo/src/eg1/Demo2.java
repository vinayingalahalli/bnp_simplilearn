package eg1;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int ar[]= {10,22,11,10,10,1,9};
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		//before doing binarySearch make sure ur array is sorted in asc order
		System.out.println(Arrays.binarySearch(ar, 9));
		System.out.println(Arrays.binarySearch(ar, 99));
		System.out.println(Arrays.binarySearch(ar, 1));
		
		int ar1[]=Arrays.copyOf(ar, ar.length+3);
		System.out.println(Arrays.toString(ar1));
		
		int ar2[]=new int[6];
		Arrays.fill(ar2, 1000);
		System.out.println(Arrays.toString(ar2));
		
		
	}

}
