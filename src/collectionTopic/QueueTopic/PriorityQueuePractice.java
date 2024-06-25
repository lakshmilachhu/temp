package collectionTopic.QueueTopic;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	public static void main(String[] args) {
		PriorityQueue list=new PriorityQueue();
		list.add(12);
		list.add(98);		
		list.add(14);
		list.add(76);
		list.add(1);
		list.add(1);
	
		
		System.out.println(list);
		Object a = list.peek();
		System.out.println(a);
		System.out.println(list);
		Object aa = list.poll();
		System.out.println(aa);
		System.out.println(list);
	}
}
