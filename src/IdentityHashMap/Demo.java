package IdentityHashMap;

import java.security.Identity;
import java.util.IdentityHashMap;

public class Demo {
public static void main(String[] args) {
	String key1 = new String("k1");
	String key2 = new String("k1");
	String key3 = new String("k3");
	String key4 = new String("k4");
	
	IdentityHashMap<String, String> hm = new IdentityHashMap<String, String>();
	hm.put(key1, "Value1");
	hm.put(key2, "Value2");
	hm.put(key3, "Value3");
	hm.put(key4, "Value4");
	
	System.out.println(hm);
}
}
