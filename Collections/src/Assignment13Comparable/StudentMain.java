package Assignment13Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public void setStudentDetails(ArrayList<Student> stud) {

		stud.add(new Student(14, "Indrajeet", 24));
		stud.add(new Student(12, "Akash", 18));
		stud.add(new Student(18, "Prashant", 19));
		stud.add(new Student(18, "Sunil", 24));
		stud.add(new Student(22, "Sushil", 22));
		stud.add(new Student(44, "Ajay", 18));
		stud.add(new Student(38, "Suraj", 22));
		stud.add(new Student(33, "Indrajeet", 19));
		stud.add(new Student(26, "Sunil", 23));
	}

	public void sortStudentByName(ArrayList<Student> stud) {
		Collections.sort(stud, new SortStudentByIdName());
	}

	public void sortStudentByAge(ArrayList<Student> stud) {
		Collections.sort(stud, new SortStudentByAge());
	}

	public void sortStudentById(ArrayList<Student> stud) {
		Collections.sort(stud, new SortStudentById());
	}

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();

		StudentMain sm = new StudentMain();

		sm.setStudentDetails(stud);
		System.out.println(stud);
		System.out.println("\n-----Sort Student By Name-----");
		sm.sortStudentByName(stud);
		System.out.println(stud);
		System.out.println("\n-----Sort Student By Age-----");
		sm.sortStudentByAge(stud);
		System.out.println(stud);
		System.out.println("\n-----Sort Student By Id-----");
		sm.sortStudentById(stud);
		System.out.println(stud);

	}

}
