package Collections;

import java.util.*;

public class DequeSample {
	public static void main(String[] args) {
//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		deque.offer("Mukesh");
		System.out.println(deque);
		System.out.println(deque.element());
		deque.removeLast();
		System.out.println(deque);
		deque.pop();
		System.out.println(deque);
//Traversing elements  
		for (String str : deque) {
			System.out.println(str);
		}
	}
}