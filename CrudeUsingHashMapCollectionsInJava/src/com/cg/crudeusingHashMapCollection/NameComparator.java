package com.cg.crudeusingHashMapCollection;

import java.util.Comparator;

public class NameComparator implements Comparator<ReadAndDisplayProductDetails>{

	@Override
	public int compare(ReadAndDisplayProductDetails product1, ReadAndDisplayProductDetails product2) {
		if((product1.getProductName().compareTo(product2.getProductName()))==0)
		    return 0;
		else if((product1.getProductName().compareTo(product2.getProductName()))>1)
            return 1;
		else
			return -1;
	}

}
