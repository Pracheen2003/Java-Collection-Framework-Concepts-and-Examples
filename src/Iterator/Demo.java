package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println("========================");
		
		for (int i = 0; i <= al.size()-1; i++) {
			System.out.println(al.get(i));
			
			System.out.println("==========================");
			
			//enhanced forloop
			for (Object x:al) {
				System.out.println(x);
			}
			
			System.out.println("==========================");
			
			Iterator itr = al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
	}

}
