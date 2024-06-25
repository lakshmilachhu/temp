package typecasting;

public class RemoteDrive implements WebdriverIO, JavascriptDriver
{

	@Override
	public void upperCase() 
	{
		System.out.println("RemoteDrive ==> It will convert string into UPPER case");
	}

	@Override
	public void lowerCase() {
		System.out.println("RemoteDrive ==> It will convert string into lower case");
		
	}

	@Override
	public void concatination() {
		System.out.println("RemoteDrive ==> It will add/concatinate two strings");
		
	}

	@Override
	public void empty() {
		System.out.println("RemoteDrive ==> It will chech whether string empty or not");
		
	}

	@Override
	public void split() {
		System.out.println("RemoteDrive ==> It will split string into 2parts");
		
	}

	@Override
	public void addition() {
		System.out.println("RemoteDrive ==> It will perform addition of numbers");
		
	}

	@Override
	public void subtraction() {
		System.out.println("RemoteDrive ==> It will perform subtraction of numbers");
		
	}

	@Override
	public void multiflication() {
		System.out.println("RemoteDrive ==> It will perform multiflication of numbers");
		
	}

	@Override
	public void division() {
		System.out.println("RemoteDrive ==> It will perform division of numbers");
		
	}

	@Override
	public void display() {
		System.out.println("RemoteDrive ==> It will display the statement");
		
	}

}
