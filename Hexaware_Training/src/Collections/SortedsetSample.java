package Collections;
import java.util.*;
public class SortedsetSample {
	public static void main(String[] args) {
		SortedSet<Customers> ss=new TreeSet<>();
		Customers Ajay=new Customers(12,"Ajay Kumar");
		Customers Vinay=new Customers(32,"Vinay Raj");
		ss.add(Vinay);
		ss.add(Ajay);
		System.out.println(ss);
		System.out.println(ss.size());
	}

}
