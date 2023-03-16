package ArrayListOfObjects;

public class Students {

	int studentId, studentMarks;
	String studentName, studentDept;

	public Students(int studentId, String studentName, int studentMarks, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}

	@Override
	public String toString() {
		return "Student [Student Id= " + studentId + ", Student Marks= " + studentMarks + ", Student Name= "
				+ studentName + ", Student Dept= " + studentDept + "]";
	}

}
