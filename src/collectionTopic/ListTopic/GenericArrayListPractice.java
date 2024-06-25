package collectionTopic.ListTopic;

import java.util.ArrayList;
import java.util.Collections;

public class GenericArrayListPractice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(109);
		list.add(3);
		list.add(23);
		
		Collections.sort(list);
		System.out.println(list);
	}
	
}
