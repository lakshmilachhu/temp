package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapProgram 
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> emp =new LinkedHashMap<>();
		emp.put("Akshatha", 20000);
		emp.put("Akash", 15000);
		emp.put("Abhay", 25000);
		emp.put("Amar", null);
		emp.put("Akash", 30000);
		emp.put("Ajay", 10000);
		System.out.println(emp);
		
		System.out.println(emp.containsKey("Akash"));
		
		System.out.println(emp.containsValue(null));
		
		emp.replace("Amar", null, 20000);
		System.out.println(emp);
		
		for(Entry<String,Integer> data : emp.entrySet())
			if(data.getValue()==20000)
			{
				System.out.println(data.getKey());
				//break;
			}
		
		System.out.println(emp.keySet());
		
		System.out.println(emp.values());
		
	}

}
