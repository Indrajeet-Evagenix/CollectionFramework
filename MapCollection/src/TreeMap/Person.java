package TreeMap;

public class Person {

	int personId;
	String personName, personEmail, personAddress;

	public Person(int personId, String personName, String personEmail, String personAddress) {
		
		this.personId = personId;
		this.personName = personName;
		this.personEmail = personEmail;
		this.personAddress = personAddress;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personEmail=" + personEmail
				+ ", personAddress=" + personAddress + "]";
	}

}
