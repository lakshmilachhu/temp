package ExeceptionHandling;

public class ExampleStackunwinding 
{
	static void display3()
	{
		int i=1/0;
	}
	static void display2()
	{
		display3();
	}
	static void display1()
	{
		display2();
	}
	public static void main(String[] args)
	{
		display1();
		System.out.println("Add");
	}

	
}
