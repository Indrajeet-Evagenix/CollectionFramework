package SelectUniqueElement;

public class Student {

	int studentId, studentMarks;
	String studentName, studentDepartment;

	public Student(int studentId, int studentMarks, String studentName, String studentDepartment) {
		
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentMarks=" + studentMarks + ", studentName=" + studentName
				+ ", studentDepartment=" + studentDepartment + "]";
	}

	public int hashCode() {
		return studentId;
	}

	public boolean equals(Object o) {
		// in that 'o' keyword represent HashTable element
		
		Student s = (Student) o;// Type cast

		if (this.studentId == s.studentId) {
			// in that 'this' keyword represent new element
//			s.studentName = this.studentName;
//			s.studentDepartment = this.studentDepartment;
//			s.studentMarks = this.studentMarks;
			return true;
		} else {
			return false;
		}
	}

}
