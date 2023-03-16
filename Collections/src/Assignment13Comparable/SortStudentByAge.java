package Assignment13Comparable;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.studentAge > o2.studentAge) {
			return 1;
		} else if (o1.studentAge < o2.studentAge) {
			return -1;
		} else
			return 0;
	}

}
