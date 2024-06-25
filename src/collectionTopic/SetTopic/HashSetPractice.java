package collectionTopic.SetTopic;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("a1");
		set.add(12);
		set.add("a3");
		set.add('z');
		set.add(1.2);		
		System.out.println(set);
//		set.remove("a1");
//		System.out.println(set);
		
		int counter=0;
		for(Object a:set) {
			if(a.equals(1.2))
			{
				break;
			}
			counter++;
		}
		System.out.println(counter);
		
		
	}

}
