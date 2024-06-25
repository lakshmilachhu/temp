package typecasting;

public class DemoUpcasting extends SampleUpcasting
{
	static void addition()
	{
		double c=a*b;
		System.out.println("Sub ==> Addition : " + c);
	}
	void mul() {
		double c=a*2;
		System.out.println("Sub ==> Multiplication : "+c);
	}
	void sub() {
		double c=a-5;
		System.out.println("SUB ==> Subtraction : "+c);
	}
	public static void main(String[] args)
	{
		SampleUpcasting ref=new DemoUpcasting();
		ref.addition();
		ref.sub();
		// ref.mul(); ==> subclass members will get hidden when we'll do upcasting
	}

}
