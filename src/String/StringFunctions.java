package String;

public class StringFunctions 
{
	public static void main(String args[])
	{
		String var="Lakshmi Mohan";
		String s1="Apple";
		String s2="Banana";
		String s3="Java123";
		String s4="Masala puri,RavaIdli,Fish fry,RavaIdli,dosa";
		String s5="     Hi, Hello   ";
		String[] ar = s4.split(",");
		System.out.println("Split count of the String = " + ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("Length of the String = " + var.length());
		System.out.println("------------------");
		System.out.println("Specific index of the String =  " + var.charAt(5));
		System.out.println("------------------");
		System.out.println("ASCII/Unicode of the character of specified index = " + var.codePointAt(7));
		System.out.println("------------------");
		System.out.println("ASCII/Unicode code points between specified index range = " + var.codePointCount(2,6));
		System.out.println("------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("------------------");
		System.out.println(s1.concat(s2));
		System.out.println("------------------");
		System.out.println(var.contains("Mohan"));
		System.out.println(var.contains("mohan")); //if it is difference in case also it'll return false - case sensitive
		System.out.println(var.contains("apple"));
		System.out.println("------------------");
		System.out.println(s1.endsWith("le"));
		System.out.println(var.endsWith("Mohan"));
		System.out.println(s2.endsWith("Ban"));
		System.out.println("------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("apple")); //case sensitive
		System.out.println(s1.equalsIgnoreCase("apple"));
		System.out.println("------------------");
		System.out.println(s1.getBytes());
		System.out.println("------------------");
		System.out.println(s2.hashCode());
		System.out.println("------------------");
		System.out.println(s2.indexOf('n'));
		System.out.println(var.indexOf("Mohan"));
		System.out.println(var.indexOf('a',4));
		System.out.println(var.indexOf("han", 3));
		System.out.println("------------------");
		System.out.println(var.isEmpty());
		System.out.println("------------------");
		System.out.println(var.lastIndexOf('a'));
		System.out.println(s2.lastIndexOf("ana"));
		System.out.println(s2.lastIndexOf('a' , 5));
		System.out.println(var.lastIndexOf("hmi", 10));
		System.out.println("------------------");
		System.out.println(s2.matches(s1));
		System.out.println(s2.matches("Banana"));
		System.out.println(s3.matches("[a-zA-Z]+\\d+"));
		System.out.println("------------------");
		System.out.println(s1.replace('p', 'S'));
		System.out.println(var.replace("Mohan","Moni"));
		System.out.println(s4.replaceAll("RavaIdli", "Masaladose"));
		System.out.println(s4.replaceFirst("RavaIdli", "Dahi puri"));
		System.out.println("------------------");
		System.out.println(var.startsWith("Lakshmi"));
		System.out.println(var.startsWith("Mohan"));
		System.out.println(var.startsWith("Mohan" , 6));
		System.out.println(var.startsWith("Mohan" , 8));
		System.out.println("------------------");
		System.out.println(var.subSequence(5, 11));
		System.out.println(var.substring(8));
		System.out.println(var.substring(5,11));
		System.out.println("------------------");
		char[] ch = s1.toCharArray();
		System.out.println(ch[3]);
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s5.trim());
	}
}
