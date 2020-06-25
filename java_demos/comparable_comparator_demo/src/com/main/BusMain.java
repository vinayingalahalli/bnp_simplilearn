package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.comparators.BusTypeComparator;
import com.model.Bus;

public class BusMain {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(121, "abc travels", 122.33, 2.3f, "sleeper"));
		busList.add(new Bus(120, "xyz travels", 112.33, 4.3f, "semi-sleeper"));
		busList.add(new Bus(110, "java travels", 192.33, 3.3f, "seater"));
		busList.add(new Bus(211, "jee travels", 142.33, 4.3f, "sleeper"));
		busList.add(new Bus(129, "pqr travels", 142.33, 3.3f, "semi-sleeper"));
		busList.add(new Bus(122, "sss travels", 122.33, 1.3f, "sleeper"));
		
		System.out.println("Printing all the buses");
		printBusList(busList);
		
		Collections.sort(busList);
		
		System.out.println("\n\nPrinting all the buses sorted based on id");
		printBusList(busList);
		
		Collections.sort(busList, new BusTypeComparator());
		System.out.println("\n\nPrinting all the buses sorted based on bustype");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1,Bus b2)->{
			Double d1=b1.getCost();
			Double d2=b2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the buses sorted based on cost");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1,Bus b2)->{
			Double d1=b1.getCost();
			Double d2=b2.getCost();
			int x= d1.compareTo(d2);
			if(x==0) {
				Float f1=b1.getRatings();
				Float f2=b2.getRatings();
				x=f2.compareTo(f1);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the buses sorted based on cost ascending if same then by ratings desc");
		printBusList(busList);
	}

	public static void printBusList(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
// Imitate the same using your favt real world object like Product, Flights, Bikes, Cars