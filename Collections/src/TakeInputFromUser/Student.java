package TakeInputFromUser;

public class Student {

	int studentId, studentMarks;
	String studentName, studentDept;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	@Override
	public String toString() {
		return "Student [Student Id= " + studentId + ", Student Marks= " + studentMarks + ", Student Name= "
				+ studentName + ", Student Dept= " + studentDept + "]";
	}

}
