package AssignmentOnMaps;

import java.util.Comparator;

public class Q11Comparator implements Comparator<Q11Order> {

	@Override
	public int compare(Q11Order o1, Q11Order o2) {

		return o1.itemName.compareTo(o2.itemName);
	}

}
