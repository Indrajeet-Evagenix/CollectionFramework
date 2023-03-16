package Assignment13Comparable;

// Q.2. 2.	WAP to create a class Student with (rollNo, name and age). 
// Create 3 Comparator implementations for each Student attribute (i.e. rollNo, name and age)
public class Student {

	int rollNumber, studentAge;
	String studentName;

	public Student(int rollNumber, String studentName, int studentAge) {
		super();
		this.rollNumber = rollNumber;
		this.studentAge = studentAge;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentAge=" + studentAge + ", studentName=" + studentName
				+ "]";
	}

}
