package Revision;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String i = sc.next();
		Subjects c = null;
		if(i.equals("a")) {
			c=new ClassA();
			
		}
		else if(i.equals("b")) {
			c=new ClassB();
		}
		else if(i.equals("c")) {
			c=new ClassC();
		}
		else {
			c=null;
		}

//		switch (i) {
//		case "a": 
//			c=new ClassA();
//			break;
//		case "b": 
//			c=new ClassB();
//			break;
//		case "c": 
//			c=new ClassC();
//			break;
//		default:
//			break;
//		}
		
		c.english();

	}

	}
