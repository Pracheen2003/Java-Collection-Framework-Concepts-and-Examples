package tostringEquals;

import java.util.HashSet;
import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product p1 = new Product(1, "Mobile", 100000);
		Product p2 = new Product(2, "Mobile", 100000);
		Product p3 = new Product(3, "TV", 200000);
		Product p4 = new Product(4, "TV", 200000);
		Product p5 = new Product(5, "Pant", 300000);
		
		HashSet hs = new HashSet();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		System.out.println(hs);
	}

}
