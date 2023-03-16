package SelectUniqueElement;

import java.util.LinkedHashMap;

public class StudentMain {

	public void setStudentDetails(LinkedHashMap<Student, Integer> stud) {

		stud.put(new Student(101, 78, "Indrajeet", "Computer"), 24);
		stud.put(new Student(121, 75, "Akash", "Computer"), 24);
		stud.put(new Student(111, 85, "Ankit", "Computer"), 24);
		stud.put(new Student(116, 90, "Sushil", "Computer"), 24);
		stud.put(new Student(198, 65, "Suraj", "Computer"), 24);
		stud.put(new Student(145, 82, "Mukesh", "Computer"), 24);
		stud.put(new Student(132, 84, "Dhanajay", "Computer"), 24);
		stud.put(new Student(188, 88, "Pankaj", "Computer"), 24);
	}

	public static void main(String[] args) {
		LinkedHashMap<Student, Integer> lhm = new LinkedHashMap<>();

		StudentMain sm = new StudentMain();
		sm.setStudentDetails(lhm);
		System.out.println(lhm);

		lhm.put(new Student(188, 89, "Sonu", "EXTC"), 28);

		System.out.println(lhm);

	}

}
