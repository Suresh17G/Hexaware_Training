package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapSample {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(100, "vijay");
		m.put(300, "hexaware");
		m.put(200, null);
		m.put("aditya", 400);
		m.put(null, 250);
		m.put(100, "ram");
		m.put(500, "rk");
		m.put(600, "rk");
		System.out.println(m);
		System.out.println(m.get(null));
		System.out.println(m.replace(null,null));

		for (Object o : m.entrySet()) {
			// type cast
			Map.Entry me = (Map.Entry) o;
			System.out.println(me.getKey() + "  " + me.getValue());

		}

	}

}