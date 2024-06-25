package collectionTopic.ListTopic;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) 
	{
		//a, mohan, 12, 12.87, Lakshmi, true

		ArrayList list=new ArrayList();
//		List list=new ArrayList(); 
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
		ArrayList list2=new ArrayList(list);
//		list2.add(2,"abc");
		list2.remove("Lakshmi");
		list2.remove("Lakshmi");
		
//		list.add("xyz");
//Object list3 = list2.clone();
//list2.clear();
System.out.println(list);
System.out.println(list2);
//		list2.add("abcdef");
//		System.out.println(list2.contains("Lakshmi"));
		System.out.println(list2.containsAll(list));
		System.out.println(list2.equals(list));
		System.out.println(list2.get(5));
		System.out.println(list2.hashCode());
//		System.out.println(list3);
		System.out.println(list2.size());
		System.out.println(list2.set(3, "moni"));
		System.out.println(list2);
		System.out.println(list2.retainAll(list));
		
		
		ArrayList l1=new ArrayList();
		l1.add("abc");
		ArrayList list1=new ArrayList();
		list1.add("abc");
		list1.add("abc1");
		list1.add("abc2");
		list1.add("abc3");
		list1.add("abc4");
System.out.println(l1);		
System.out.println(list1);	
list1.retainAll(l1);
System.out.println(list1);
list1.clear();
System.out.println(list1);	
		
	}
}
