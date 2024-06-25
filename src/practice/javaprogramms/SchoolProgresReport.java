package practice.javaprogramms;

public class SchoolProgresReport implements School 
{
	public void display()
	{
		String name="Lacchu";
		int age=26;
		int marks = 92;
		char grade='A';
		System.out.println(name);
		
	}

	@Override
	public void result() 
	{
		System.out.println("The toper is" );
		display();
	}
	
	public static void main(String[] args)
	{
		 SchoolProgresReport r= new SchoolProgresReport();
		 r.result();
	}

}
