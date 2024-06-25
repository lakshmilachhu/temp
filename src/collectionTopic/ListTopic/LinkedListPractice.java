package collectionTopic.ListTopic;

import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add('a');
		list.add("mohan");
		list.add(12);
		list.add(12.87);
		list.add(12.87);
		list.add("Lakshmi");
		list.add("Lakshmi");
		list.add(true);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		Object a = list.peek();
		System.out.println(a);
		System.out.println(list);
		Object aa = list.poll();
		System.out.println(aa);
		System.out.println(list);
	}
}
