package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ProductSortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product(125,"Handle",3000,500);
		Product product2 = new Product(25,"Break cable",300,25);
		Product product3 = new Product(50,"Cluch Plate",2500,250);
		Product product4 = new Product(175,"Piston Rod",13000,186);
		Product product5 = new Product(30,"Gear rod",1800,10);
		
		ArrayList<Product> al = new ArrayList();
		al.add(product1);
		al.add(product2);
		al.add(product3);
		al.add(product4);
		al.add(product5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
