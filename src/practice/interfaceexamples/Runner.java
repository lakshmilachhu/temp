package practice.interfaceexamples;

public class Runner implements Demo1
{
	@Override //to cross check the signature and syntax of the superclass method we will use override annotation
	public void add() //we can override static methods
	{
		int sum=b1+c1;
		System.out.println(sum);
	}
	@Override
	public void mul() // we can override non static methods
	{
		int mult=a1*b1*c1;
		System.out.println(mult);
	}
	
	public static void main(String[] args)
	{
		Runner ref=new Runner();
		ref.add();
		ref.mul();

	}
	

}
