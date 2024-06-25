package collectionTopic.SetTopic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram 
{
	public static void main(String[] args)
	{
		Set set=new LinkedHashSet();
		set.add("Mohan");
		set.add("Lacchu");
		set.add(143);
		set.add(14.56);
		set.add(null);
		set.add("Lahana");
		
//		normal way of getting all elements in set
		System.out.println(set); 
				
		System.out.println("************");
		
//		using iterator() function
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("************");
		
//		using for-each looping statement
		for(Object word:set)
			System.out.println(word);
		
		System.out.println("************");
		
		if(set.contains(null))
			System.out.println("This set contains null value");
		
		if(!set.contains(777))
			System.out.println("Doesn't present in this set");
		
		System.out.println("************");
		
		set.remove(null);
		System.out.println(set);
		
	}
}
