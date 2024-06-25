package Revision;

public class Employee 
{
	public  int salary=30000;
	String company = "TestYantra";
	String team = "RMG";
	
	public void empDetails(int empID, String name, int phonenum, int hike)
	{
		System.out.println("Employee ID is " + empID);
		System.out.println("Employee Name is " + name);
		System.out.println("Employee Phone num is " + phonenum); 
		salary=salary+hike;
		System.out.println("Employee salary is " + salary);
	}
	
	

}
