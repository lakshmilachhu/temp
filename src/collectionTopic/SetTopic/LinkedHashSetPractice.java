package collectionTopic.SetTopic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		Set set=new LinkedHashSet();
		set.add("a1");
		set.add(12);
		set.add(12);
		set.add("a3");
		set.add("a3");
		set.add('z');
		set.add(1.2);		
		set.add(1.2);		
		System.out.println(set);
		
		
	}

}
