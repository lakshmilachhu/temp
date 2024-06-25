package typecasting;

public class SampleUpcasting 
{
	static int a=200;
	static double b=235.25;
	
	static void addition()
	{
		double c=a+b;
		System.out.println("Super ==> Addition : "+ c);
	}

	void sub() {
		double c=a-2;
		System.out.println("Super ==> Subtraction : "+c);
	}
}
