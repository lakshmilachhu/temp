package Assignment;

public class Program5 {
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			if(i==3)
				continue; // continue statement, it jumps straight to the next iteration, bypassing the rest of the code inside the loop for the current iteration.
			System.out.println(i);
		}
		System.out.println("*****************");
		int j=1;
		while(j<=10)
		{
			if(j==5)
			{
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("*****************");
		int k=1;
		do
		{
			if(k==7)
			{
				k++;
				continue;
			}
			System.out.println(k);
			k++;
			
		}
		while(k<=10);
	}
}
