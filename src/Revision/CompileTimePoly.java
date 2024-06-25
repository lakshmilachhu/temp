package Revision;

public class CompileTimePoly 
{
	void whatsappSent(int num)
	{
		System.out.println("Sending number " + num);
	}
	void whatsappSent(String text)
	{
		System.out.println("Sending text " + text);
	}
	void whatsappSent(int num,String text)
	{
		System.out.println("Sending num with text " + num + text);
	}
	void whatsappSent(String text, int num)
	{
		System.out.println("Sending text with number " + text + num);
	}
	
	public static void main(String[] args)
	{
		CompileTimePoly c=new CompileTimePoly();
		c.whatsappSent(1234567890);
		c.whatsappSent("Hello, good morning");
		c.whatsappSent("Mohana", 143);
		c.whatsappSent(143, "Lacchu");
	}
}