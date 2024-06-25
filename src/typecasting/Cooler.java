package typecasting;

public class Cooler extends Tester
{
	int x=10;
	
	void add()
	{
		System.out.println("Sub Addition");
	}
	
	public static void main(String[] args)
	{
		Tester t1=new Cooler(); // Up-casting implicitly
		t1.add();
//		t1.x; ==> CTE 
		
//		Cooler c2=(Cooler) new Tester();  Down-casting explicitly
		Cooler c1=(Cooler) t1;  //==> we can write like this also -> Down-casting explicitly
		System.out.println(c1.x);
		c1.add();
		c1.sub();
		
		Tester t2=(Tester) new Cooler(); // Up-casting explicitly
		t2.add();
		
		}
}
