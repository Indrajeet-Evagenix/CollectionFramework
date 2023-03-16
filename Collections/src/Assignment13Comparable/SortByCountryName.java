package Assignment13Comparable;

import java.util.Comparator;

public class SortByCountryName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.prof.country.compareTo(o2.prof.country);
	}

}
