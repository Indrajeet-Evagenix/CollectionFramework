package CloneMethod;

public class Student12 implements Cloneable {

	int id;
	String name;
	Department12 dept;

	public Student12(int id, String name, Department12 dept) {

		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String toString() {
		return "Student12 [id=" + id + ", name=" + name + ", Department: " + dept + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		Student12 s = (Student12) super.clone();
		s.dept = (Department12) dept.clone();
		return s;
	}
}
