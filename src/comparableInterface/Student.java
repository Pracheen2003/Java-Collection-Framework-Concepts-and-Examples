package comparableInterface;

public class Student implements Comparable<Student> {
private int id;
private String name;

public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

//@Override
//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return this.name.compareTo(o.name);
//	return 0;
//}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(this.id>o.id)
		return 1;
	else if(this.id<o.id)
		return -1;
	else
		return 0;

}

}
