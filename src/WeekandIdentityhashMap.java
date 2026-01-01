import java.util.WeakHashMap;

public class WeekandIdentityhashMap {
public static void main(String[] args) {
	
	String key1 = new String("k1");
	String key2 = new String("k2");
	String key3 = new String("k3");
	String key4 = new String("k4");
	
	WeakHashMap<String, String> hm = new WeakHashMap<String, String>();
	hm.put(key1, "Value1");
	hm.put(key2, "Value2");
	hm.put(key3, "Value3");
	hm.put(key4, "Value4");
	
	System.out.println(hm);
	
	key2 = null;
	
	System.gc();
	for(int i = 0; i <= 10; i++) {
		System.out.println("");
	}
	
	System.out.println();
	System.out.println(hm);
	
}
}
