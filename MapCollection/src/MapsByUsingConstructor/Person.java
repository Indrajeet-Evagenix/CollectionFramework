package MapsByUsingConstructor;

public class Person {

	int personId, personAge;
	String personName, personEmail;

	IDProof idProof;

	public Person(int personId, int personAge, String personName, String personEmail, IDProof idProof) {
		this.personId = personId;
		this.personAge = personAge;
		this.personName = personName;
		this.personEmail = personEmail;
		this.idProof = idProof;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personAge=" + personAge + ", personName=" + personName
				+ ", personEmail=" + personEmail + ", idProof=" + idProof + "]";
	}

}
