package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student(10,"Sachin");
Student s2 = new Student(5,"Sourav");
Student s3 = new Student(3,"Ajay");
Student s4 = new Student(40,"Boomra");

ArrayList al = new ArrayList();
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
System.out.println(al);
Collections.sort(al);
System.out.println(al);

	}

}
