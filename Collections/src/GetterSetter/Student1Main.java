package GetterSetter;

import java.util.ArrayList;

public class Student1Main {

	public static void main(String[] args) {
		ArrayList<Student1> stud = new ArrayList<>();

		stud.add(new Student1(101, "Indrajeet", 68, "Computer"));
		stud.add(new Student1(102, "Akash", 78, "Civil"));
		stud.add(new Student1(103, "Shubham", 88, "IT"));
		stud.add(new Student1(104, "Anuj", 92, "EXTC"));
		stud.add(new Student1(105, "Ankit", 72, "MECHANICAL"));
		stud.add(new Student1(106, "Aashish", 74, "Computer"));
		stud.add(new Student1(107, "Sushil", 82, "Civil"));
		stud.add(new Student1(108, "Suraj", 86, "IT"));
		stud.add(new Student1(109, "Sankesh", 73, "EXTC"));
		stud.add(new Student1(110, "Aman", 93, "MECHANICAL"));

		for (Student1 st : stud) {
			if (st.getStudentName().startsWith("S") || st.getStudentName().startsWith("A")) {
//				System.out.println(st);
			}
			if (st.getStudentDept().equalsIgnoreCase("civil")) {
				int marks = st.getStudentMarks();
				st.setStudentMarks(marks + 2);
				System.out.println(st);
			}
		}

	}

}
