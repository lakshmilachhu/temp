package ArrayPractice;

public class NameOccurance 
{
	public static void main(String[] args)
	{
		String[] name= {"Appu","Akash","Appu","Akash","Mohan", "Lakshmi"}; //if are going intialize values direclty to the array, we should't give array size.
		String a=" Lakshmi ".trim();
		int count=0;
		for(int k=0;k<name.length;k++)
		{
			if(name[k].equals(a))
			{
			count++;
			}
		}
		if(count>0) {
			System.out.println(a + " present "+count+" times");
		}
		else
		{
			System.out.println(a + " not present");
		}
	}
}
