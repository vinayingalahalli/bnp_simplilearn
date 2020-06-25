package com.comparators;

import java.util.Comparator;

import com.model.Bus;

public class BusTypeComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus b1, Bus b2) {
		
		return b1.getBusType().compareTo(b2.getBusType());
	}

}
