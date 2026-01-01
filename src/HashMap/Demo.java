package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();
hm.put("Name1", "Ram");
hm.put("Name2", "Ramesh");
hm.put("Name3", "Rohan");
hm.put("Name4", "Suresh");
System.out.println(hm);

LinkedHashMap<Integer, String> lhs = new LinkedHashMap<Integer, String>();
lhs.put(100, "Sahana");
lhs.put(50, "Sindhu");
lhs.put(150, "Swathi");
lhs.put(25, "Shruthi");
System.out.println(lhs);

TreeMap tm = new TreeMap();
tm.put(100, "Ramesh");
tm.put(50, "Ram");
tm.put(150, "Somu");
tm.put(25, "Ganesh");
System.out.println(tm);

	}

}
