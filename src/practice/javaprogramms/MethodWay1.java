package practice.javaprogramms;

public class MethodWay1 
{
	public static int addition(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static float multiflication(float a,int b)
	{
		float c=a*b;
		return c;
	}
	public static void main(String[] args)
	{
		int x=addition(15,25);
		float y=multiflication(5.6f,3);
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
