package Practice;

// POJO Class
import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName, studentDept;
	ArrayList<Integer> marks;

	public Student(int studentId, String studentName, String studentDept, ArrayList<Integer> marks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", Marks= " + marks + "]";
	}

}