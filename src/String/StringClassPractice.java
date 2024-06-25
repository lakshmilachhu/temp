package String;

public class StringClassPractice
{
	public static void main(String[] args)
	{
		String s1="Mohan";
		System.out.println(System.identityHashCode(s1));		
		s1="Lakshmi";
		String s2="Mohan";
		String s3="Lakshmi";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("============================");
		
		String a1=new String("Mohan");
		String a2=new String("Mohan");
		String a3=new String("Mohan");
		
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println(System.identityHashCode(a3));
		
	}
}