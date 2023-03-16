package MapsUserInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {

	public void setStudentDetails(HashMap<Integer, Student> stud) {
		Scanner sc = new Scanner(System.in);
		stud.put(4, new Student(101, "Indrajeet", "indrajeet@gmail.com"));
		stud.put(40, new Student(121, "Akash", "akash@gmail.com"));
		stud.put(14, new Student(111, "Ankit", "ankit@gmail.com"));
		stud.put(18, new Student(116, "Sushil", "sushil@gmail.com"));
		stud.put(12, new Student(198, "Suraj", "suraj@gmail.com"));
		stud.put(24, new Student(145, "Mukesh", "mukesh@gmail.com"));
		stud.put(8, new Student(132, "Dhanajay", "dhananjay@gmail.com"));
		stud.put(29, new Student(188, "Pankaj", "pankaj@gmail.com"));
		stud.put(36, new Student(212, "Javed", "javed@gmail.com"));
		stud.put(42, new Student(245, "Ashish", "ashish@gmail.com"));
		stud.put(49, new Student(98, "Siddhi", "siddhi@gmail.com"));
		stud.put(54, new Student(11, "Mangesh", "mangesh@gmail.com"));

//		System.out.println("Enter Student Details");
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Enter Id, Name and Email");
//			int id = sc.nextInt();
//			String name = sc.next();
//			String email = sc.next();
//
//			Student st = new Student();
//			st.setStudentId(id);
//			st.setStudentName(name);
//			st.setStudentEmail(email);
//
//			stud.put(id, st);
//		}
	}

	public void display(HashMap<Integer, Student> stud) {
		Student st = new Student();
		for (Map.Entry<Integer, Student> ent : stud.entrySet()) {
			if (ent.getValue().studentName.startsWith("A")) {
				System.out.println(ent.getKey() + " " + ent.getValue());
//				System.out.println("Student id: " + st.getStudentId());
			}
		}

	}

	public static void main(String[] args) {
		HashMap<Integer, Student> hmap = new HashMap<>();

		StudentMain sm = new StudentMain();
		sm.setStudentDetails(hmap);
		System.out.println(hmap);
		sm.display(hmap);

	}

}
