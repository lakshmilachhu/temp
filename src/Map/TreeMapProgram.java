package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapProgram 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1, "One");
		tmap.put(2, "two");
		tmap.put(5, "five");
		tmap.put(4, "four");
		tmap.put(0, "zero");
		System.out.println("Map contents: " + tmap);
		
		System.out.println("Key's descending order: " + tmap.descendingKeySet());
		
		System.out.println("Map is descending order: " + tmap.descendingMap());
		
		for(Entry<Integer,String> data:tmap.entrySet())
		{
			if(data.getKey()==4)
			{
				System.out.println(data.getValue());
				break;
			}
		}
		
		System.out.println("First entry of Map: " + tmap.firstEntry());
		
		System.out.println("Last entry of Map: " + tmap.lastEntry());
		
		System.out.println("First key of the Map: " + tmap.firstKey());
		
		System.out.println("Last key of the Map: " + tmap.lastKey());
		
		System.out.println("Retrive the first element: " + tmap.pollFirstEntry());
		System.out.println("After performing poll: " + tmap);
		
		System.out.println("Retrive the last element: " + tmap.pollLastEntry());
		System.out.println("After performing poll: " + tmap);
	
	
	}

}
