package oopsConcept;

class gmail 
{
	private String password="Lacchu123";
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}

public class EncapsulationMain
{
	public static void main(String[] args)
	{
		gmail g1=new gmail();
		System.out.println(g1.getPassword());
		g1.setPassword("Moni123");
		System.out.println(g1.getPassword());
	}
}
