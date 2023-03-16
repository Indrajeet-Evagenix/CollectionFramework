package TreeMap;

import java.util.Comparator;

public class SortStudentvalueComparator implements Comparator<Student12> {

	@Override
	public int compare(Student12 o1, Student12 o2) {

		return o1.studentName.compareTo(o2.studentName);
	}

}
