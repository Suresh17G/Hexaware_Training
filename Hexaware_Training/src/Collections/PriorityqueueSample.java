package Collections;

import java.util.*;

public class PriorityqueueSample {
	public static void main(String args[]) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		//Uses heap structure
		queue.add(23);
		queue.add(9);
		queue.add(180);
		queue.offer(56);
		System.out.println(queue);
		/*
		 * Now, 	 9
		 * 		  23	180
		 * 	  56
		 * */
		/*for(Integer i:queue) {
			System.out.println(i);
		}*/
		System.out.println("head:" + queue.element());
		queue.remove();
		/* 9 is removed
		 * now, 	56(last element)  -->  		23
		 * 		23		180					56		180
		 * */
		System.out.println(queue);
		System.out.println("head:" + queue.peek());
		queue.poll();
		System.out.println(queue);
		System.out.println("head:" + queue.peek());
	}
}