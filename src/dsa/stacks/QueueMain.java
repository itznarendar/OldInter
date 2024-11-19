 package dsa.stacks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.Queue;

public class QueueMain {
//keybaord buffer order of the preseed appear
	//printer queue
	//linkedlist,bfs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue =new LinkedList<String>();
		queue.offer("Naren");
		queue.offer("ira");
		queue.offer("ananth");
		queue.offer("anoo");
		queue.offer("sravan");
		//to remove
		String s=queue.poll();
		System.out.println(s+" peek "+queue.peek()+queue );
		
		Queue<Double> priorityQueue =new PriorityQueue<Double>(Collections.reverseOrder());
		priorityQueue.offer(22.2);
		priorityQueue.offer(12.2);
		priorityQueue.offer(32.2);
		priorityQueue.add(52.2);
		System.out.println("priority queue"+priorityQueue);
		
		
	}

}
