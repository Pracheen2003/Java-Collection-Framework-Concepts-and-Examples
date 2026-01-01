package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeeList = new ArrayList<Employee>();

        employeeeList.add(new Employee(125, "Sahana", 10000, 3));
        employeeeList.add(new Employee(5, "Akash", 20000, 4));
        employeeeList.add(new Employee(15, "Praveen", 15000, 0));
        employeeeList.add(new Employee(25, "Shyam", 10060, 2));
        employeeeList.add(new Employee(1250, "Arghya", 10080, 8));

        System.out.println(employeeeList);

        Comparator<Employee> e = (o1, o2) -> {
            if (o1.getId() > o2.getId())
                return 1;
            else if (o1.getId() < o2.getId())
                return -1;
            else
                return 0;
        };
        Collections.sort(employeeeList,e);
        System.out.println(employeeeList);
    
        Comparator<Employee> e1 = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };

        Collections.sort(employeeeList, e1);
        System.out.println(employeeeList);
        
        Comparator<Employee>e3=(o1,o2)->{
        	if(o1.getSalary()>o2.getSalary())
        		return 1;
        	else if (o1.getSalary()<o2.getSalary())
        		return -1;
        	else
        		return 0;
        };
        Collections.sort(employeeeList,e3);
        System.out.println(employeeeList);
        
        

	}
}

