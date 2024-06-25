package Assignment;

public class Program6withoutCondition 
{
	public static void main(String[] args)
	{
		int limit=10;
		for(int i=2; i<=2*limit; i+=2) 
		{
			System.out.println(i);
			/*this example, the loop starts from 2 and increments by 2 in each iteration. 
			 *The loop continues as long as the variable i is less than or equal to twice the specified limit. 
			This way, you print only even numbers without using an explicit conditional statement.*/
		}
		System.out.println("----------------------------");
		for(int j=2; j<=10; j+=2)
		{
			System.out.println(j);
			/* In this example, the for loop is initialized with int j = 2, and it continues as long as number is less than or equal to 10. 
			 * The loop increments j by 2 in each iteration, and even numbers are printed. */
		}
		System.out.println("----------------------------");
		int num=2;
		while(num<=10)
		{
			System.out.println(num);
			num+=2;
		}
	}

}
