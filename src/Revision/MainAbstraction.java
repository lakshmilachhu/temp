package Revision;

public class MainAbstraction extends SampleAbstraction
{
	public static void main(String[] args)
	{
//		DemoAbstraction d=new SampleAbstraction();
//		d.display();
//		d.test(); 			here also hiding is done
		
//		SampleAbstraction s=new MainAbstraction();
//		s.display();      it will display method definition
//		s.test();
		
//		MainAbstraction m= new SampleAbstraction();  CTE = its showing type mismatch, because sub to super class not posible, it should in manner super to sub.

		DemoAbstraction d= new MainAbstraction();
		d.display();		// here it is hiding the complexity
		d.test();
	}

}
