package eg;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("java");
		hs.add(null);
		//System.out.println(hs.add("java"));
		hs.add("java");
		hs.add(null);
		hs.add("jee");
		hs.add("jme");
		hs.add("msa");
		hs.add("vm");
		System.out.println(hs);
		
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("java");
		lhs.add(null);
		lhs.add("java");
		lhs.add(null);
		lhs.add("jee");
		lhs.add("jme");
		lhs.add("msa");
		lhs.add("vm");
		System.out.println(lhs);
		
		
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("hello");
		ts.add("java");
		//ts.add(null);
		ts.add("java");
		//ts.add(null);
		ts.add("jee");
		ts.add("jme");
		ts.add("msa");
		ts.add("vm");
		System.out.println(ts);
		
		System.out.println(ts.size());
		System.out.println(ts.contains("jee"));
		System.out.println(ts.contains("jme"));
		System.out.println(ts.contains("jse"));
		
		ts.remove("jme");
		System.out.println(ts);
		
		for(String s:ts) {
			System.out.println(s.toUpperCase());
		}
		
		//addAll ,  removeAll  ,  retainAll
	}

}
