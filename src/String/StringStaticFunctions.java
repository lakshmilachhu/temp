package String;

public class StringStaticFunctions 
{
	public static void main(String[] args)
	{
		// for primitive types
		int a=25;
		double b=34.56;
		boolean c= true;
		
		String s1=String.valueOf(a);
		String s2=String.valueOf(b);
		String s3=String.valueOf(c);
		System.out.println(a+b);
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Double.parseDouble(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("------------------");
		//for Objects
		Integer a1 = 35;
		Double a2 = 46.77;
		Boolean a3 = false;
		
		String p=String.valueOf(a1);
		String q=String.valueOf(a2);
		String r=String.valueOf(a3);
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
		System.out.println("------------------");
		//handling null
		Object val=null;
		String res=String.valueOf(val);
		System.out.println(res);
	}

}
