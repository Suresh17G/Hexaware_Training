package Collections;

import java.util.HashSet;
import java.util.Set;

public class hashsetSample {
	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("sanjay");
		hs.add("Ajay");
		hs.add(null);
		hs.add("Mukesh");
		hs.add("Ajay");//No error but not inserted twice
		System.out.println(hs);
		hs.remove("Ajay");
		System.out.println(hs);
		System.out.println(hs.contains(null));	
	}
}
