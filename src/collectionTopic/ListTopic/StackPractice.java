package collectionTopic.ListTopic;

import java.util.Stack;

public class StackPractice {
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.push("x1");
	s1.push("x2");
	s1.push("x3");

	Stack s=new Stack();
	s.push("a1");
	s.push("a2");
	s.push("a3");
	s.push(s1);
	System.out.println(s);
//	System.out.println(s.size());
//	Stack ss = (Stack)s.get(3);
//	Object z = ss.get(0);
//	System.out.println(z);
	Object a = s.pop();
	System.out.println(a);
	System.out.println(s);
}
}
