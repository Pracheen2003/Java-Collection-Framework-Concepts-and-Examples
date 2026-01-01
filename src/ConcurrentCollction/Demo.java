package ConcurrentCollction;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
//		for (int i = 0; i<=al.size()-1;i++) {
//			System.out.println(al.get(i));
//			al.add(99);
//		}

	
	Iterator<String> itr = al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		al.add(999);
	}
	}
}

