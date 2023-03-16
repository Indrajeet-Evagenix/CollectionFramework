package SelectUniqueElement;

public class FbUser {

	int id;
	String name, email, gender, password, contact;

	public FbUser(int id, String name, String email, String gender, String password, String contact) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "FbUser [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", password="
				+ password + ", contact=" + contact + "]";
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		// in that 'o' keyword represent HashTable element

		FbUser fb = (FbUser) o;// Type cast

		if (this.id == fb.id) {
			return true;
		} else {
			return false;
		}
	}

}
