package Collections;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");

	    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

	    System.out.println(cars);

	}

}
