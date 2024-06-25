package Assignment;

public class Program6 
{
	public static void main(String[] args)
	{
	 /* for(int i=1; i<=10; i++)
	  {
		  while(i%2==0)              getting correct output, but logic performance is not good. you can use "if condition" istead of while.
		  {
			  System.out.println(i + " is a even number");
			  i++;                    no need to mention increment statement here.
		  }
	  } */
		
		/* int i=1;
		if(i<=10)            // "if statement" is a condition for one line statement not looping.
		{
			while(i%2==0)
			{
				System.out.println(i);   you've to use "for loop" for looping/repeating conditions 
			}
			i++;
			} */
		
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("****************************");
		for(int j=11; j<=20; j++)
		{
			if(j%2==0)
			{
				System.out.println(j + " is a even number");
			}
			else 
				System.out.println(j + " is not a even number");
		}
		System.out.println("****************************");
		int k=26;
		String result = (k%2==0)? "even" : "odd" ;
		System.out.println("The number " + k + " is " + result);
		System.out.println("****************************");
		for(int m=1; m<=10; m++)
		{
			if(m%2!=0)
			{
				continue;
			}
			System.out.println(m + " even number");
		}
	}
}

