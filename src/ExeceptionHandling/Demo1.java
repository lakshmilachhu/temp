package ExeceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		//		int a=10;
		//		int b=0;

		//		int c=a/b;
		//	hold(3);
		//		System.out.println(c);

		//		int[] arr=new int[4];
		//		System.out.println(arr[4]);

		String s=null;
		try 
		{	
			System.out.println(s.isEmpty());
			System.out.println(s.isBlank());
		}
		catch (Exception e) 
		{
			s="";
			System.out.println(s.isBlank());
		}

	}

	static void hold(int seconds) {
		try {

			Thread.sleep(1000*seconds);
		} catch (InterruptedException e) {
			System.out.println("Execption Handled");
		}	
	}
	
	public static int division(int a, int b) throws CompileTimeExceptionExample 
	{
		if(b==0) {
			throw new CompileTimeExceptionExample("since b value is zero, Can't calculate");
		}
		return a/b;
	}
	public static int Multiplication(int a, int b)  {
		if(b==0) {
			throw new RunTimeExceptionExample("since b value is zero, Can't calculate");
		}
		return a*b;
	}
}
