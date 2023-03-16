package Practice;

// DAO Class
import java.util.ArrayList;
import java.util.Iterator;

public class StudentOperation {

	public void setElemnts(ArrayList<Student> stud) {
		ArrayList<Integer> m1 = new ArrayList<>();
		ArrayList<Integer> m2 = new ArrayList<>();
		ArrayList<Integer> m3 = new ArrayList<>();
		ArrayList<Integer> m4 = new ArrayList<>();
		ArrayList<Integer> m5 = new ArrayList<>();

		m1.add(60);
		m1.add(65);
		m1.add(70);
		m1.add(75);
		m1.add(40);

		m2.add(80);
		m2.add(85);
		m2.add(90);
		m2.add(60);
		m2.add(65);

		m3.add(70);
		m3.add(75);
		m3.add(80);
		m3.add(85);
		m3.add(90);

		m4.add(60);
		m4.add(65);
		m4.add(70);
		m4.add(75);
		m4.add(40);

		m5.add(70);
		m5.add(75);
		m5.add(40);
		m5.add(85);
		m5.add(90);

		stud.add(new Student(101, "Indrajeet", "Computer", m1));
		stud.add(new Student(10, "Akaksh", "Civil", m2));
		stud.add(new Student(111, "Sonu", "IT", m3));
		stud.add(new Student(151, "Monu", "Computer", m4));
		stud.add(new Student(142, "Sumit", "Civil", m5));

	}

	public void percentage(ArrayList<Student> stud) {
		for (Student st : stud) {
			double sum = 0;
			for (Integer mark : st.marks) {
				sum = sum + mark;
			}
			double percent = sum / st.marks.size();
			char ch = grade(percent);
			System.out.println("Student id: " + st.studentId + ", Student Name: " + st.studentName
					+ "\nStudent Department: " + st.studentDept + ", Percentage: " + percent + "\nGrade: " + ch);
			System.out.println();
		}
	}

	// By Using Iterator Method
	public void percentage1(ArrayList<Student> stud) {
		Iterator<Student> itr = stud.iterator();
		System.out.println("Percentage of Computer Departments Student\n");
		while (itr.hasNext()) {
			double sum = 0;
			Student st = itr.next();

			if (st.studentDept.equalsIgnoreCase("computer")) {
				Iterator<Integer> markItr = st.marks.iterator();
				while (markItr.hasNext()) {
					sum = sum + markItr.next();
				}
				double percent = sum / st.marks.size();
				char ch = grade(percent);
				System.out.println("Student id: " + st.studentId + ", Student Name: " + st.studentName
						+ "\nStudent Department: " + st.studentDept + ", Percentage: " + percent + "\nGrade: " + ch);
				System.out.println();
			}
		}
	}

	char grade(double per) {
		if (per > 75)
			return 'A';
		else if (per > 70)
			return 'B';
		else
			return 'C';
	}

}
