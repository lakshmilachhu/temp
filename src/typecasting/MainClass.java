package typecasting;

public class MainClass 
{
	public static void main(String [] args)
	{
		System.out.println("Up Casting - implicitly");
		Demo d1=new Sample(); //implicitly doing up casting
		System.out.println(d1.a);
		// d1.add(); once up casted we will get only super class properties. It hides the subclass properties, if we tried to access it'll show CTE.
		
		System.out.println("Down Casting");
		Sample s1=(Sample)d1; //without upcasting we can't do downcasting
		s1.a=s1.b;
		s1.add();
		
		System.out.println("Up Casting - explicitly");
		Demo d2=(Demo)s1;
		System.out.println(d2.b);
		//d2.add();CTE
		
			
	/*	Demo md=new Demo();
	System.out.println(md.a);
		Sample ms=(Sample)md;
		*/
		
	}

}
