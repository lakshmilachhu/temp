package practice.javaprogramms;

public class SuperB extends SuperA
{
	SuperB(int b)
	{
		super("Namasthe");
		System.out.println("How are you "+b);
		// super("Hi");      you can't able to call super() statement twice in a same constructor
	}
}
