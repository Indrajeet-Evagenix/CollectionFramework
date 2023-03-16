package ComparatorExample;

import java.util.Comparator;

// Comparator Example

public class EmployeeSortUsingName implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator emp1, EmployeeComparator emp2) {

		return emp1.employeeName.compareTo(emp2.employeeName);
	}

}
