package Collections;

import java.util.Comparator;

public class CustomerIDComparator implements Comparator<Customers> {

	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		return o1.getCustomerID().compareTo(o2.getCustomerID());
	}

}
