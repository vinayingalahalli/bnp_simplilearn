package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "java");
		hm.put(120, "jme");
		hm.put(null, "java");
		hm.put(140, "jee");
		hm.put(110, null);
		hm.put(160, null);
		hm.put(150, "git");
		System.out.println("Before Deletion");
		System.out.println("map data = " + hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()==null || e.getValue()==null) {
//				hm.remove(e.getKey());
//			}
//		}
		//Iterator<Bus> b=busList.iterator();
		
		Iterator<Entry<Integer, String>> i= hm.entrySet().iterator(); 
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();
			if(e.getKey()==null || e.getValue()==null) {
				i.remove();
			}
		}
		
		System.out.println("After Deletion");
		System.out.println("map data = " + hm);

	}

}
/*
 *Enumerator - loop - read from top to bottom only
 *Iterator(child of Enumerator) - read and remove from top to bottom
 *ListIterator(child of Iterator) - add, read, remove and is bidrectional but applicable only on List 
*/