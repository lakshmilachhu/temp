package ExeceptionHandling;

public class RunTimeExceptionExample extends RuntimeException{
	
	public RunTimeExceptionExample(){
		super();
	}
	public RunTimeExceptionExample(String message){
		super(message);
	}
}
