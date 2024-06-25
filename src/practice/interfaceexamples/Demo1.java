package practice.interfaceexamples;

public interface Demo1 
{
	/* private int a=10;
	protected String b="Mohan";
	default int c=15; In interface variables can't be private,protected and default */

	public int a1=20; // In interface variable have only one specifier i,e public
	int b1=50; // if you didn't mention any access specifier also then it implicitly consider it as public
	public static final int c1 = 10; //In interface variables are by default static,final and public and not able to create non static variable
    
	
	void add(); // this method contains public specifier as default, all public methods doesn't have body because i,e abstract methods
	
	private static void sub() //we can use private for static methods but there is no more use for that
	{
		int d1=a1-b1;
		System.out.println(d1);
	}
	
	default void mul() // for default method body is compulsory
	{
	}
}
