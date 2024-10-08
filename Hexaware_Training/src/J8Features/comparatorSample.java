package J8Features;

import java.util.SortedSet;
import java.util.TreeSet;

public class comparatorSample {
	public static void main(String[] args) {
		SortedSet<Customers> ss=new TreeSet<>((x,y)-> y.getCustomerID().compareTo(x.getCustomerID()));
		Customers Ajay=new Customers(12,"Ajay Kumar");
		Customers Vinay=new Customers(32,"Vinay Raj");
		Customers Vijay=new Customers(102,"Harry");
		ss.add(Vinay);
		ss.add(Ajay);
		ss.add(Vijay);
		System.out.println(ss);
		//System.out.println(ss.size());
	}
}
