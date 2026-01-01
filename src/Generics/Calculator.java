package Generics;

public class Calculator <T>{
// Generics
	public T a;
	public T b;
	
	void display() {
		System.out.println(a+" "+b);
	}
	
	void display2(T x) {
		System.out.println(x);
	}
	//Generics method
	<A> void display3(A x) {
		System.out.println(x);
	}
}
