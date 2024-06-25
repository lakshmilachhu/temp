package ArrayPractice;

public class Movies 
{
	public static void main(String[] args)
	{
		String[] name= {"Appu","Abhi","Arasu","Akash","Anjaniputhra"}; //if are going intialize values direclty to the array, we should't give array size.
//		for(int i=0;i<name.length;i++)
//		{
//			System.out.println("List of Puneeth movie's " + name[i]);
//		}
//		System.out.println("****************");
//		int j=0;
//		while(j<name.length)
//		{
//			System.out.println("movies of Puneeth "+ name[j]);
//			j++;
//		}
//		System.out.println("****************");
//		String a="Arasu";
//		boolean flag=false;
//		for(int k=0;k<name.length;k++)
//		{
//			if(name[k].equals(a))
//			{
//			flag=true;
//			break;
//			}
//		}
//		if(flag) {
//			System.out.println(a + " Movie is present");
//		}
//		else
//		{
//			System.out.println(a + "Movie is not present");
//		}
//		System.out.println("****************");
		String a="Arasu";
		Search s=new Search();
		boolean status = s.search(name, a);
	System.out.println(status);	
	if(status) {
		System.out.println(a + " Movie is present");
	}
	else
	{
		System.out.println(a + "Movie is not present");
	}
	}
	
	
}
