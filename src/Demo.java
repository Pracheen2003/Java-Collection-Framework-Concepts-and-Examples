import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		String key1 = new String("c1");
		String key2 = new String("c2");
		String key3 = new String("c3");
		String key4 = new String("c4");
		
		List<Integer> class1 = new ArrayList<Integer>();
		class1.add(100);
		class1.add(50);
		class1.add(150);
		class1.add(25);
		
		List<Integer> class2 = new ArrayList<Integer>();
		class2.add(75);
		class2.add(125);
		class2.add(175);
		class2.add(150);
		
		List<Integer> class3 = new ArrayList<Integer>();
		class3.add(76);
		class3.add(135);
		class3.add(115);
		class3.add(149);
		
		List<Integer> class4 = new ArrayList<Integer>();
		class4.add(71);
		class4.add(145);
		class4.add(185);
		class4.add(158);
		
		Map<String, List<Integer>> classScores = new HashMap<String, List<Integer>>();
		classScores.put(key1, class1);
		classScores.put(key2, class2);
		classScores.put(key3, class3);
		classScores.put(key4, class4);
		
		System.out.println(classScores);
		
			
		}
	}


