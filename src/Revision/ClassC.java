package Revision;

public class ClassC extends ClassB{
String s="mohan";

	@Override
	public void kannada(int a) {
		System.out.println("Class C --> kannada");
	}
	
	public void english(String s) {
		System.out.println("Class C --> english "+s);
	}
	
	@Override
	public void english() {
		System.out.println("Class C --> english");
	}
	@Override
	public void hindi() {
		System.out.println("Class C --> hindi");
	}
	
	@Override
	public void maths() {
		System.out.println("Class C --> Maths");
		
	}

	@Override
	public void science() {
		System.out.println("Class C --> science");
	}

	@Override
	public void social() {
		System.out.println("Class C --> social");
	}	
	
	
}
