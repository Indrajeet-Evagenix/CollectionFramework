package MapsUserInput;

public class Student {

	int studentId;
	String studentName, studentEmail;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Student() {

	}

	public Student(int studentId, String studentName, String studentEmail) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}

}
