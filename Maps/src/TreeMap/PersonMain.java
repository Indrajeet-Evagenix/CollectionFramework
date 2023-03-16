package TreeMap;

import java.util.TreeMap;

public class PersonMain {

	public void setPersonDetails(TreeMap<Person, Integer> tmp) {
		tmp.put(new Person(121, "Indrajeet", "indrajeet@gmail.com", "Mumbai"), 24);
		tmp.put(new Person(108, "Akash", "akash@gmail.com", "Pune"), 23);
		tmp.put(new Person(112, "Shivani", "shivani@gmail.com", "Lucknow"), 25);
		tmp.put(new Person(118, "Sachin", "sachin@gmail.com", "Surat"), 20);
		tmp.put(new Person(128, "Mangesh", "mangesh@gmail.com", "Mumbai"), 22);
		tmp.put(new Person(124, "Pankaj", "pankaj@gmail.com", "Pune"), 21);

	}

	public static void main(String[] args) {
		TreeMap<Person, Integer> tmp = new TreeMap<>(new PersonComparator());

		PersonMain pm = new PersonMain();
		pm.setPersonDetails(tmp);
		System.out.println(tmp);

		System.out.println();
		TreeMap<Person, Integer> tmp1 = new TreeMap<>(new SortPersonAddressComparator());
		// Give at Least one value as Unique
		// or Write Logic in Comparator
		pm.setPersonDetails(tmp1);
		System.out.println(tmp1);

	}

}
