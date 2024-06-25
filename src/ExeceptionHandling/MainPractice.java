package ExeceptionHandling;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MainPractice{
	public static void main(String[] args) {
		try 
		{
			int output = Demo1.division(10, 0);
			System.out.println(output);
		}
		catch (CompileTimeExceptionExample e) 
		{
			e.printStackTrace();
			StringWriter sw=new StringWriter();
			PrintWriter pw=new PrintWriter(sw);
			e.printStackTrace(pw);
			System.out.println("Execption handled ===> "+sw.toString());
		}
		System.out.println(Demo1.Multiplication(6, 0));
		

	}
}
