package CloneMethod;

import java.util.ArrayList;

public class Student1Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(40);
		marks.add(50);
		marks.add(70);
		marks.add(60);

		Student1 s = new Student1("Indrajeet", marks);

		Student1 s1 = (Student1) s.clone();// Deep copy and Shallow copy

		System.out.println(s);
		System.out.println(s1);

		s1.marks.add(80);
		s1.marks.add(90);

		System.out.println();
		System.out.println(s);
		System.out.println(s1);

	}

}
