package Mapview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> data = new HashMap<Integer, String>();
data.put(100, "Ramya");
data.put(50, "Soumya");
data.put(150, "Bhavya");
data.put(25, "Priya");
data.put(75, "Suraj");

System.out.println(data);

Set keys = data.keySet();
Iterator itr = keys.iterator();
while(itr.hasNext()) {
System.out.print(itr.next()+" ");
	}
System.out.println();

Collection values = data.values();
itr=values.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}

System.out.println();
Set keyvalue = data.entrySet();
itr = keyvalue.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next()+" ");
}
}
}