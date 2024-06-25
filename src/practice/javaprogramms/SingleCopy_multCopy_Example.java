package practice.javaprogramms;

public class SingleCopy_multCopy_Example {

	int fee=1000;
	public static void main(String[] args)
	{
		SingleCopy_multCopy_Example s1= new SingleCopy_multCopy_Example();
		s1.maths();
		s1.science();
		System.out.println(s1.fee);
		SingleCopy_multCopy_Example s2= new SingleCopy_multCopy_Example();
		s2.maths();
		s2.science();
		System.out.println(s2);
		System.out.println(s2.fee);
	}

	public  void maths() {
		fee=fee+1000;
	}
	public  void science() {
		fee=fee+2000;

	}
}
