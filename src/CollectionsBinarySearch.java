import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Number of elements to add");

Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
ArrayList<Integer> al = new ArrayList<Integer>();
for (int i = 1; i <= n; i++) {
	al.add(scan.nextInt());
}
System.out.println(al);

System.out.println("Ener key to Search");
int key = scan.nextInt();
Collections.sort(al);
System.out.println("Key " +key+" is present at the index "+Collections.binarySearch(al, key));
System.out.println(Collections.min(al));
System.out.println(Collections.max(al));
al.add(175);
System.out.println(Collections.frequency(al, 175));
System.out.println(al);
Collections.shuffle(al);
System.out.println(al);
Collections.rotate(al, 1);
System.out.println(al);
	}

}
