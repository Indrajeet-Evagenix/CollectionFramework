package ComparatorExample;

import java.util.Comparator;

//Comparator Example

public class EmployeeSortByRating implements Comparator<EmployeeComparator> {

	public int compare(EmployeeComparator o1, EmployeeComparator o2) {

		if (o1.rating > o2.rating) {
			return 1;
		} else if (o1.rating < o2.rating) {
			return -1;
		} else {
			return o1.employeeName.compareTo(o2.employeeName);
		}
	}
}
