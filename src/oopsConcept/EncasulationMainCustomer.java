package oopsConcept;

class ICICIBank
{
	private int password=2342;
	public int getPassword()
	{
		return password;
	}
	public void setPassword(int password)
	{
		this.password=password;
	}
}

public class EncasulationMainCustomer
{
	public static void main(String[] args)
	{
		ICICIBank c1=new ICICIBank();
		System.out.println(c1.getPassword());
		c1.setPassword(1212);
		System.out.println(c1.getPassword());
	}
}