
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Disjoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
ArrayList<Integer> al = new ArrayList<Integer>();

for (int i = 1; i <= n; i++) {
	al.add(scan.nextInt());
}
System.out.println(al);

System.out.println("Enter Number of elemnets to add");
n = scan.nextInt();
ArrayList<Integer> al2 = new ArrayList<Integer>();
for (int i = 1; i <= n;i++) {
	al2.add(scan.nextInt());
}
System.out.println(al2);
System.out.println(Collections.disjoint(al, al2));
	}
}
