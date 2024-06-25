package collectionTopic.SetTopic;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram 
{
	public static void main(String[] args)
	{
		Set set=new HashSet();
		set.add("Hello");
		set.add("Papa");
		set.add(1234);
		set.add(24.56);
		set.add('A');
//		set.add(1234);  duplicates not allowed
		System.out.println(set);
		
		for(Object word:set)    //object will not refer null, it'll throw nullpoint exception
		{
			if(word.equals("Papa"))
			{
				set.remove(word);
				break;
			}
		}
		System.out.println("Updated Set is :" + set);
		
		for(Object word:set)    
		{
			if(word.equals(24.56))
			{
				set.remove(word); //we can't directly replace a element, so we'll add the data once removing the element.
				set.add("muddu");
				break;
			}
		}
		System.out.println("Updated Set is :" + set);
		
		
		set.add(null);
		System.out.println(set);
		
		boolean b=set.contains(null);
		System.out.println("null is present in set:" + b);
		
		int size=set.size();
		System.out.println("Size of the set:" + size);
		
		boolean a=set.isEmpty();
		System.out.println("Set is not empty:" + a);	

			
		set.clear();
		System.out.println(set);
	
	}
}
