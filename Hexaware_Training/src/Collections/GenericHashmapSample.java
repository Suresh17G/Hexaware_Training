package Collections;

import java.util.HashMap;
import java.util.Map;

public class GenericHashmapSample {
	
	public static void main(String[] args) {

		Map<Integer,String> m = new HashMap<>();
		m.put(100, "rk");
		m.put(200, "hexaware");
		m.put(300, "amit");
		m.put(400, "hemanth");
		m.put(500, "kavitha");
		m.put(600, "rese");
		System.out.println(m.keySet());
		System.out.println(m.values());
		for(Integer i: m.keySet()) {
			System.out.println(i+" | "+m.get(i));
		}
		/*
		for (Map.Entry<Integer,String> me : m.entrySet()) {
			
			System.out.println(me.getKey() + "  " + me.getValue());

		}*/
	}

}