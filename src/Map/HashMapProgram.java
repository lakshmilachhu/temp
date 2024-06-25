package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapProgram 
{
	public static void main(String[] args)
	{
		Map<String, Integer> empIDs=new HashMap<>();
		
		//to add the element into map
		empIDs.put("Lakshmi", 12345);
		empIDs.put("Mohan", 23456);
		empIDs.put("Lahana", 34567);
		empIDs.put("Mola", 45678);
		empIDs.put("Lachhu", 567890);
//		empIDs.put(null, null);    	  Both key and value can be a null
//		empIDs.put("Mola", 45678);    duplicate will not allow
//		empIDs.put("Mola", 1111);     consider updated value
		System.out.println(empIDs);
		
		//to fecth the value of specified Key
		int id=empIDs.get("Lahana");
		System.out.println(id);
		
		//to check the map contains specified Key
		boolean status=empIDs.containsKey("Lachhu");
		System.out.println("Is key present:" + status);
		
		//to check the map contains specified Value
		boolean statuss=empIDs.containsValue(478);
		System.out.println("Is value present:" + statuss);
		
		//Overriding the value to existing key using put()
		empIDs.put("Mola",777);
		System.out.println(empIDs);
		
		//replace a value using replace()
		empIDs.replace("Mola", 1111);
		System.out.println(empIDs);
		
		//if key is not present it'll not update nothing, it remains same
		empIDs.replace("Moni",12312);
		System.out.println(empIDs);
		
		//add the key&value, if element is not present in map
		empIDs.putIfAbsent("Moni", 143);
		System.out.println(empIDs);
		
		//returns set of keys in map
		Set<String> keys =empIDs.keySet();
		for(String name:keys)
			System.out.println(name);
		
		//check map is empty or not
		System.out.println(empIDs.isEmpty());
		
		//remove the element based on key
		empIDs.remove("Mola");
		System.out.println(empIDs);
		
		//remove the element based on key&value
		empIDs.remove("Lachhu",567890);
		System.out.println(empIDs);
		
		System.out.println(empIDs.values()); //get all values from map
		System.out.println(empIDs.keySet()); //get all keys from map
		
		//get key of particular value
		for(Entry<String,Integer> data:empIDs.entrySet()) {
			if(data.getValue()==143) {
				System.out.println(data.getKey());
				break;
			}
		}	
	}

}
