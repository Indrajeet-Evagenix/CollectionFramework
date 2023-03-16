package ArrayListOfObjects;

public class Person {

	int personId;
	String personName, personContact;

	Address add;

	public Person(int personId, String personName, String personContact, Address add) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personContact = personContact;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personContact=" + personContact
				+ ", add=" + add + "]";
	}

}
