import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> marks1 = new HashMap<String, Integer>();
marks1.put("Kannada", 100);
marks1.put("English", 100);
marks1.put("Hindi", 90);
marks1.put("Science", 100);
marks1.put("Math", 100);
marks1.put("SST", 100);

Map<String, Integer> marks2 = new HashMap<String, Integer>();
marks2.put("Kannada", 90);
marks2.put("English", 90);
marks2.put("Hindi", 80);
marks2.put("Science", 90);
marks2.put("Math", 90);
marks2.put("SST", 90);

Map<String, Object> studentData1 = new IdentityHashMap<String, Object>();
studentData1.put("SubjectMarks", marks1);

Map<String, Object> studentData2 = new IdentityHashMap<String, Object>();
studentData2.put("SubjectMarks", marks2);

Map<String, Map<String, Object>> student = new HashMap<String, Map<String, Object>>();
student.put("Student1", studentData1);
student.put("Student2", studentData2);

System.out.println(student);


	}

}
