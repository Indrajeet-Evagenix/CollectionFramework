package TakeInputFromUser;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> stud = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter '" + (i + 1) + "' Student Details");
			System.out.println("Enter  Student Id");
			int id = sc.nextInt();
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Marks");
			int mark = sc.nextInt();
			System.out.println("Enter Student Department");
			String dept = sc.next();

			Student st = new Student();
			st.setStudentId(id);
			st.setStudentName(name);
			st.setStudentMarks(mark);
			st.setStudentDept(dept);
			stud.add(st);
		}

		System.out.println(stud);
		for (Student s : stud) {
			if (s.getStudentDept().equalsIgnoreCase("computer")) {
				System.out.println(s);
			}
		}

	}

}
