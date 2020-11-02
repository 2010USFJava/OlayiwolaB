package com.revature.queuee;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> myQueue = new LinkedList<>();
		
		myQueue.add("Mercury");
		myQueue.add("Earth");
		myQueue.add("jupitar");
		myQueue.add("Venus");
		myQueue.add("Venus");
		
		System.out.println(myQueue);
		
		/**for(String s: myQueue) {
			//myQueue.poll();
			System.out.println(s);
		}
		*/
		/**System.out.println(myQueue.poll());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());		
		System.out.println(myQueue.poll());
		*/

		
		Queue<String> myDeQueue = new ArrayDeque<>();

		myDeQueue.add("Mars");
		myDeQueue.add("Neptune");
		myDeQueue.add("engine");

		/**for(String s: myDeQueue) {
			myDeQueue.poll();
			System.out.println(s);
		}
		*/
		Queue<String> myPriority = new PriorityQueue<>();
	
		myPriority.addAll(myQueue);
		
		myPriority.addAll(myDeQueue);

		System.out.println(myPriority);

	}

}
