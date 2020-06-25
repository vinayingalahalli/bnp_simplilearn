package eg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("fdsdsdff");
		l.add(2222);
		l.add(12.333);
		l.add(true);
		l.add(new Object());
		l.add(2222);
		System.out.println(l);
		
		List<Integer> l1=new LinkedList<>();
		l1.add(122);
		l1.add(121);
		l1.add(122);
		l1.add(112);
		l1.add(null);
		l1.add(11);
		l1.add(null);
		l1.add(null);
		l1.add(11);
		l1.add(99);
		System.out.println(l1);
		l1.add(2, 99);
		System.out.println(l1);
		l1.set(2, 199);
		System.out.println(l1);
		System.out.println(l1.get(0));
		System.out.println(l1.size());
		l1.remove(10); //index
		System.out.println(l1);
		Integer i=11;
		while(l1.remove(i)) {} //remove the element
		System.out.println(l1);
		
		System.out.println(l1.contains(121));
		System.out.println(l1.contains(10000));
		
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.replaceAll(l1, null, -1);
//		Collections.sort(l1); for ascending
		Collections.sort(l1,Collections.reverseOrder()); //for descending
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);//sort in asc b4 binarysearch
		System.out.println(Collections.binarySearch(l1, 112));
		
		
		List<Integer> list1=new LinkedList<>(Arrays.asList(12,33,55,11,11,33,11,22,58));
		System.out.println("list1 "+list1);
		List<Integer> list2=new ArrayList<>(Arrays.asList(44,22,44,66,88,33,11,9));
		System.out.println("list2 "+list2);
		//list1.retainAll(list2);// common between list1 & list2 -> results are stored in list1
		//list1.removeAll(list2); // A-B
		list1.addAll(list2);// list1 unionall list2
		System.out.println("list1 "+list1);
	}

}
