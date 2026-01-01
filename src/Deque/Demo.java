package Deque;

import java.util.ArrayDeque;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		System.out.println(ad);
		ad.addFirst(9);
		ad.addFirst(99);
		System.out.println(ad);
		ad.addLast(8);
		ad.addLast(88);
		
		System.out.println(ad);
		//ad.add(2,9999);=> no such behavior
		System.out.println("ad====>"+ad);
		System.out.println(ad.peek());
		System.out.println("ad====>"+ad);
		System.out.println(ad.poll());
		System.out.println("ad====>"+ad);
		System.out.println(ad.peekFirst());
		System.out.println("ad====>"+ad);
		System.out.println(ad.pollFirst());
		System.out.println("ad====>"+ad);
		System.out.println(ad.peekLast());
		System.out.println("ad====>"+ad);
		System.out.println(ad.pollLast());
		System.out.println("ad====>"+ad);
		
		
	}

}
