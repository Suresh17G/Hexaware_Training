package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class comparatorSample {
	public static void main(String[] args) {
		SortedSet<Customers> ss=new TreeSet<>(new CustomerNameComparator());
		Customers Ajay=new Customers(12,"Ajay Kumar");
		Customers Vinay=new Customers(32,"Vinay Raj");
		Customers Vijay=new Customers(102,"Harry");
		ss.add(Vinay);
		ss.add(Ajay);
		ss.add(Vijay);
		System.out.println(ss);
		System.out.println(ss.size());
	}
}
