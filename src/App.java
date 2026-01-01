
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDs arrayDs = new ArrayDs(5);
		arrayDs.insert(20, 0);
		arrayDs.insert(10, 1);
		arrayDs.insert(30, 2);
		arrayDs.insert(50, 3);
		arrayDs.insert(40, 4);
		arrayDs.display();
		System.out.println();
		arrayDs.sort();
		arrayDs.display();
	}

}
