package typecasting;

public class TypeCasting 
{
	public static void main(String[] args)
	{
		System.out.println("Widenning casting");
		double w1=20; //implicitly
		System.out.println(w1);
		
		float w2=345231324;
		System.out.println(w2);
		
		double w3=(double)5678.987f;  //explicitly
		System.out.println(w3);
		
		float w4=(float)887979;
		System.out.println(w4);
		
		System.out.println("Narrow casting");
		int n1=(int)4567389.897d;
		System.out.println(n1);
		
		short n2=(short)34522.111f;
		System.out.println(n2);
		
		byte n3=(byte)768;
		System.out.println(n3); 
	}

}
