package typecasting;

public class Chrome extends RemoteDrive
{
  String status="Married";
  int months=8;
	@Override
	public void upperCase() {
		System.out.println("Chrome ==> It will convert string into upperCase");
	}

	@Override
	public void lowerCase() {
		System.out.println("Chrome ==> It will convert string into lowerCase");
	}

	@Override
	public void concatination() {
		System.out.println("Chrome ==> It will convert string into concatination");
	}

	@Override
	public void empty() {
		System.out.println("Chrome ==> It will convert string into empty");
	}

	@Override
	public void split() {
		System.out.println("Chrome ==> It will convert string into split");
	}

	@Override
	public void addition() {
		System.out.println("Chrome ==> It will convert string into addition");
	}

	@Override
	public void subtraction() {
		System.out.println("Chrome ==> It will convert string into subtraction");
	}

	@Override
	public void multiflication() {
		System.out.println("Chrome ==> It will convert string into multiflication");
	}

	@Override
	public void division() {
		System.out.println("Chrome ==> It will convert string into division");
	}

	@Override
	public void display() {
		System.out.println("Chrome ==> It will convert string into display");
	}
	
	
	
	
	

}

/*
 * class Demo1 extends RemoteDrive 
 * { 
 * 		RemoteDrive rd=new Demo1(); 
 * 		void sample() 					==> we can create multiple classes in a single file.
 * 		{									but only one public class, and it should contains main method and this class name as saved as file name.
 * 			rd.display(); 				==> we can extends other classes multiple times in a single file.
 * 		}									and we also create object in multiple classes in single file.
 * }										but there is no use, because it'll not contains main method, so it'll not execute.
 */
