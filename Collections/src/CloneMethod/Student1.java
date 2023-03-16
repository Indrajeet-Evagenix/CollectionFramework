package CloneMethod;

import java.util.ArrayList;

public class Student1 implements Cloneable {

	String name;
	ArrayList<Integer> marks;

	public Student1(String name, ArrayList<Integer> marks) {
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "Student1 [name=" + name + ", Marks: " + marks + "]";
	}

	public Object clone() throws CloneNotSupportedException {

		Student1 s = (Student1) super.clone();
		s.marks = (ArrayList<Integer>) marks.clone();
		return s;

	}

}
