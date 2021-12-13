package com.xworks.merge;

import java.util.Comparator;

public class ProductBasedCompAcending implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o1.compareTo(o2);
	}

}
