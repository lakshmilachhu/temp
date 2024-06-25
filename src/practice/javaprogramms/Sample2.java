package practice.javaprogramms;

public class Sample2 implements Sample1
{

	@Override
	public void test() {
		System.out.println("He : Hello Bangari");
	}

	@Override
	public void display() {
		System.out.println("She : get lost Idiot");
	}
	
	public static void main(String[] args)
	{
		Sample2 s=new Sample2();
		s.test();
		s.display();
	}
	

}
