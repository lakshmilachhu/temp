package Revision;

public class ClassB extends ClassA{


	
	public void kannada(String a) {
		System.out.println("Class B --> kannada");
	}
	
	public void kannada(int a) {
		System.out.println("Class B --> kannada");
	}

	@Override
	public void english() {
		System.out.println("Class B --> english");
	}

	@Override
	public void hindi() {
		System.out.println("Class B --> hindi");
	}
	
	@Override
	public void maths() {
		System.out.println("Class B --> Maths");
		
	}

	@Override
	public void science() {
		System.out.println("Class B --> science");
	}

	@Override
	public void social() {
		System.out.println("Class B --> social");
	}	
	
}
