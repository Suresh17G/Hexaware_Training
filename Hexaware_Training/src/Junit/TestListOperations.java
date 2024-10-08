package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestListOperations {
	static ListOperations obj;
	static ArrayList<String> cars;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj=new ListOperations();
		cars=new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add(0, "Mazda");
	}
	@Test
	void testinsertion() {
		boolean result= obj.ListAddition(cars,"Nissan");
		assertTrue(result,"Must return true");
		System.out.println(cars);
		
	}
	@Test
	void testsearch() {
		boolean result= obj.searchList(cars,"BMW");
		assertTrue(result,"Must return true");
		
	}

}
