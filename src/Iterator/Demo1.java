package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li = new LinkedList();
		li.add(100);
		li.add(50);
		System.out.println(li.size());
		li.add(150);
		li.add(25);
		li.add(75);
		System.out.println(li.size());
		li.add("Ramu");
		li.add(3.147f);
		li.add(true);
		System.out.println(li.size());
		System.out.println(li);
		li.add(2,999);
		System.out.println("is empty "+li.isEmpty());
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		LinkedList stack = new LinkedList();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		Iterator itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("pop=> "+stack.pop());
		System.out.println("pop=> "+stack.pop());
		System.out.println("pop=> "+stack.pop());
		System.out.println("pop=> "+stack.pop());
		System.out.println("pop=> "+stack.pop());


	}

}
