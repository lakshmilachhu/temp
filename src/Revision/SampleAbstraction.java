package Revision;

public class SampleAbstraction  implements DemoAbstraction
{
	public void display()
	{
		System.out.println("Hello, How are You");
	}

	@Override
	public void test() 
	{
		System.out.println("Hi, I'm fine");		
	}
}
