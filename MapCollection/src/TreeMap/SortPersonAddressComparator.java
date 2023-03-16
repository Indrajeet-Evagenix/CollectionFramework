package TreeMap;

import java.util.Comparator;

public class SortPersonAddressComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if (o1.personAddress.compareTo(o2.personAddress) == 0) {
			return 1;
		} else {
			return o1.personAddress.compareTo(o2.personAddress);
		}
	}

}
