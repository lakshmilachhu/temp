package practice.interfaceexamples;

public class Sample2 implements Sample1
{

	@Override
	public void test() {
		System.out.println("Good morning");
	}

	@Override
	public void cool() {
		System.out.println("Good Evening");
	}
}
