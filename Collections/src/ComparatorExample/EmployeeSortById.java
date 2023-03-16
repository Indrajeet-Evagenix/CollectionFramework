package ComparatorExample;

import java.util.Comparator;

//Comparator Example

public class EmployeeSortById implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {

		if (o1.employeeId > o2.employeeId) {
			return 1;
		} else if (o1.employeeId < o2.employeeId) {
			return -1;
		} else {
			return 0;
		}
	}
}
