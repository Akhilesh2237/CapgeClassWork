package com.cg.crudeusingHashMapCollection;

import java.util.Comparator;

public class PriceComparator implements Comparator<ReadAndDisplayProductDetails>{

	@Override
	public int compare(ReadAndDisplayProductDetails product1, ReadAndDisplayProductDetails product2) {
		if(product1.getProductPrice() == product2.getProductPrice())
			return 0;
			else if(product1.getProductPrice() > product2.getProductPrice())
				return 1;
			else
				return -1;
	}

}
