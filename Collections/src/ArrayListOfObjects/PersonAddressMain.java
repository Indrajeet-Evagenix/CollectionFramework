package ArrayListOfObjects;

import java.util.ArrayList;
import java.util.ListIterator;

public class PersonAddressMain {

	void elements(ArrayList<Person> all) {

		Address ad = new Address("Pune", "Maharashtra", "India");
		all.add(new Person(111, "Sanjay", "9876543212", ad));
		all.add(new Person(101, "Anjali", "9876543289", new Address("Mumbai", "Maharashtra", "India")));
		all.add(new Person(121, "Sachin", "9876567289", new Address("Mumbai", "Maharashtra", "India")));
		all.add(new Person(10, "Rahul", "9566543209", new Address("Nashik", "Maharashtra", "India")));
		all.add(new Person(169, "Riya", "9886543289", new Address("Pune", "Maharashtra", "India")));
		all.add(new Person(2, "Raj", "9876543777", new Address("Mumbai", "Maharashtra", "India")));
		all.add(new Person(118, "Gaurav", "9873343289", new Address("Nashik", "Maharashtra", "India")));
		all.add(new Person(156, "Ganesh", "9876567280", new Address("Pune", "Maharashtra", "India")));
		all.add(new Person(100, "Jyoti", "9866553289", new Address("Pune", "Maharashtra", "India")));
		all.add(new Person(198, "Geet", "9886543333", new Address("Nashik", "Maharashtra", "India")));

	}

	void displayCityWise(ArrayList<Person> per) {
		for (Person p : per) {
			if (p.add.city.equalsIgnoreCase("pune")) {
				System.out.println(p.personName + " " + p.personContact + " " + p.add.city);
			}
		}
	}

	void removePerson(ArrayList<Person> per) {
		ListIterator<Person> list = per.listIterator();
		while (list.hasNext()) {
			Person p = list.next();
			if (p.add.city.equalsIgnoreCase("mumbai")) {
				list.remove();
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<>();

		PersonAddressMain pam = new PersonAddressMain();

		pam.elements(al);
		System.out.println(al);

		pam.displayCityWise(al);
		
		pam.removePerson(al);
		System.out.println(al);

	}

}
