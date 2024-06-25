package practice.javaprogramms;

public interface Program1 
{
	// protected int b=1; it is invalid modifier 
	// private int b=2;  again it is also invalid modifier
	// default int b=3; CTE
	public int a=10;  // only one access specifier i,e Public 
	int b=20; // by default it will consider public specifier
	public static final int c=30; // variables are always by default it will public and static, final.
	// c=35; because of it final, you can't re initialize the variable
	
	/* void addition()
		{
			}*/ //it means public method always abstract, it doesn't body for that
	
	default int addition()
	{
		int a=10;	//default method should have body
		return a;
	}
	
	static void subtraction()
	{
		 String name="Lacchu";  // static method also have body
	}
	
	public void multiflication();  // no body
	
	/* Program1()
		{     		// interface cann't have constructors therefore no object creations
			} */
}
