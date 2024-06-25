package collectionTopic.SetTopic;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> names=new TreeSet<>();
//		names.add("Lakshmi");
//		names.add("Mohana");
//		names.add("Lahana");
//		names.add("Mola");
//		names.add("Lachhu");
//		names.add("Moni");
		
		names.add(23);
		names.add(14);
		names.add(56);
		System.out.println(names);
		
//		int word=names.ceiling(51);
//		System.out.println("Greater than or equal element of Mola: "+ word);
//		
//		Iterator it=names.descendingIterator();
//		while(it.hasNext())	
//			System.out.println(it.next());
//		
//		System.out.println(names);
//		
		NavigableSet set =names.descendingSet();
		System.out.println(set);
//		
//		Integer firstElement=names.first();
//		System.out.println(firstElement);
//		
//		Integer lastElement=names.last();
//		System.out.println(lastElement);
//		
//		Integer num=names.floor(60);
//		System.out.println(num);
//	
//		System.out.println(names.higher(14));
//		System.out.println(names.lower(56));
		
//		System.out.println(names);
//		System.out.println(names.pollFirst());
//		System.out.println(names.pollLast());
//		
		Iterator it=names.descendingIterator();
		while(it.hasNext())
			System.out.println(it.next());
	
	}

}
