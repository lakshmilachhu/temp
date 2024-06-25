package typecasting;

public class MainTypecast 
{
	public static void main(String[] args)
	{
		//upcasting
		WebdriverIO wd=new Chrome(); //Abstraction
		wd.display();
		wd.multiflication();
		System.out.println(wd.lname);
		
		System.out.println("****************");
		
		RemoteDrive rd=new Chrome();		//upcasting
		rd.addition();
		System.out.println(rd.fname);
		rd.concatination();
//		 System.out.println(rd.status); //in upcasting subclass members can't access
	
		System.out.println("****************");
		
		Chrome c=(Chrome) rd;
		c.upperCase();
		c.division();   // in dowm casting we access both super and sub class's properties
		c.split();
		System.out.println(c.status.equals(c.fname));
//		System.out.println(c.months.concate(c.lname)); //primitive type with non primitive type concatinaton is not possible
		
		System.out.println("****************");
		
		RemoteDrive r=(RemoteDrive) wd; //by using super class object,directly we are doing down cast
		r.empty();
		r.display();
		
		System.out.println("****************");
	
		JavascriptDriver jd=(JavascriptDriver) wd;
		jd.upperCase();
	}

}
