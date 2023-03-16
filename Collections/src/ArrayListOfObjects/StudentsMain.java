package ArrayListOfObjects;

import java.util.ArrayList;

public class StudentsMain {

	public static void main(String[] args) {
		ArrayList<Students> stud = new ArrayList<>();

		stud.add(new Students(101, "Indrajeet", 68, "Computer"));
		stud.add(new Students(102, "Akash", 78, "Civil"));
		stud.add(new Students(103, "Shubham", 88, "IT"));
		stud.add(new Students(104, "Anuj", 92, "EXTC"));
		stud.add(new Students(105, "Ankit", 72, "MECHANICAL"));
		stud.add(new Students(106, "Aashish", 74, "Computer"));
		stud.add(new Students(107, "Sushil", 82, "Civil"));
		stud.add(new Students(108, "Suraj", 86, "IT"));
		stud.add(new Students(109, "Sankesh", 73, "EXTC"));
		stud.add(new Students(110, "Aman", 93, "MECHANICAL"));

//		System.out.println(stud);

		for (Students st : stud) {
			if (st.studentDept.equalsIgnoreCase("computer")) {
//				System.out.println(st);
			}
			if (st.studentMarks > 80) {
//				System.out.println(st);
			}
//			if (st.studentDept.equalsIgnoreCase("civil")) {
//				int marks = st.studentMarks;
//				marks = marks + 2;
//				System.out.println(st);
//			}

			if (st.studentName.startsWith("S")) {
				System.out.println(st);
			}
		}

	}

}
