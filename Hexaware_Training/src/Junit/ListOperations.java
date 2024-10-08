package Junit;

import java.util.ArrayList;

public class ListOperations {
	
	boolean ListAddition(ArrayList<String> cars,String s) {
		cars.add(s);
		if(cars.contains(s)) {return true;}
		return false;
	}
	boolean searchList(ArrayList<String> cars,String s) {
		if(cars.contains(s)) {
			return true;
		}
		return false;
	}
}
