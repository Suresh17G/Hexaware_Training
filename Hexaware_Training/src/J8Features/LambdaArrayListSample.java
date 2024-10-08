package J8Features;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaArrayListSample {
	//  int compare(T o1, T o2);

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("hemanth");
		al.add("lalitha");
		al.add("rk");
		al.add("ishmita");
		al.add("amith");
		al.add("kush");
		
		//Collections.sort(al, (x,y)-> y.compareTo(x));
		//System.out.println(al);
		System.out.println(al);
		//    R apply(T t);
		al.stream().map(x -> x.toUpperCase()).forEach(x->System.out.println(x));
	}

}