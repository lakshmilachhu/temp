package collectionTopic;
import java.util.ArrayList;

public class ArrayListSample2 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20.56);
		a1.add('A');
		a1.add("Lakshmi");
		a1.add("Lakshmi");
		a1.add(null);
		a1.add(null);
		a1.add(true);
		a1.add(true);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add(2, "Mohan");
		a1.add(6, "Moni");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(5));
		
		ArrayList l1=new ArrayList(a1);
		l1.addAll(a1);
		l1.addAll(2,a1);
		System.out.println(l1.size());
		System.out.println(l1);
		
		ArrayList l2=new ArrayList(100);
		System.out.println(l2.size());
		
		
		System.out.println(l1.containsAll(a1));
	}
	

}
