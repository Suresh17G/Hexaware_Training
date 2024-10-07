package Collections;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customers> {
	@Override
	public int compare(Customers o1, Customers o2) {
		// TODO Auto-generated method stub
		return o2.getCustomerName().compareTo(o1.getCustomerName());
	}
}
