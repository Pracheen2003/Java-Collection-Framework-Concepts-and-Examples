package legacy;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(100);
		v.add(50);
		v.add(150);
		v.add(25);
		v.add(75);
		v.add(125);
		v.add(175);
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	Stack stack = new Stack();
	stack.push(100);
	stack.push(50);
	stack.push(150);
	System.out.println(stack);
	
	e=stack.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	}
}
