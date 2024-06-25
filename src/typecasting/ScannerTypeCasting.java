package typecasting;
import java.util.Scanner;

public class ScannerTypeCasting 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
//		System.out.println("Enter a string value");
//		String a=s1.next();
//		System.out.println(a);
		
		System.out.println("Enter a String value");
		String b=s1.nextLine();
		System.out.println(b);
		
		System.out.println("Enter a Byte value");
		byte c=s1.nextByte();
		System.out.println(c+12);
		
		System.out.println("Enter a Short value");
		short d=s1.nextShort();
		System.out.println(d+45);
		
		System.out.println("Enter a Integer value");
		int e=s1.nextInt();
		System.out.println(e+"I'm integer");
		
		System.out.println("Enter a Long value");
		long f =s1.nextLong();
		System.out.println(f+"I'm long");
		
		System.out.println("Enter a Float value");
		float g=s1.nextFloat();
		System.out.println(g+"I'm float");
		
		System.out.println("Enter a Double value");
		double h=s1.nextDouble();
		System.out.println(h+"I'm double");
		
		System.out.println("Enter a Boolean value");
		boolean i=s1.nextBoolean();
		System.out.println(i+"yes");
		
		System.out.println("Enter a Char value");
		char j=s1.next().charAt(0);
		System.out.println(j);
	}
}	
