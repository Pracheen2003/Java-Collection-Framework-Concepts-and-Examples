package Generics;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator<Integer> calci = new Calculator<Integer>();
		calci.a = 100;
		calci.b=200;
		calci.display();
		calci.display2(100);
		calci.display3(200);
		calci.display3(3.15f);
		calci.display3("Rama");
		System.out.println("SUM IS"+(calci.a+calci.b));
		
		Calculator<String> calci2 = new Calculator<String>();
		calci2.a="Raja";
		calci2.b="Rama";
		calci2.display();
		System.out.println("FulName:"+(calci2.a+calci2.b));
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rama");
		al2.add("Raj");
		al2.add("Ravana");
		
		ArrayList al3 = new ArrayList<>();
		al3.add(3.154f);
		al3.add("Rava");
		
		
	}

}
