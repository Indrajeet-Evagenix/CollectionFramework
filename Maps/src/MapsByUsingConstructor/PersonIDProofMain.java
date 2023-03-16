package MapsByUsingConstructor;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonIDProofMain {

	public void setPersonDetails(ArrayList<Person> alp) {

		alp.add(new Person(112, 24, "Indrajeet", "indrajeet@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
		alp.add(new Person(121, 21, "Sushil", "sushil@gmail.com", new IDProof("Pan Card", "LifeTime")));
		alp.add(new Person(111, 26, "Mukesh", "mukesh@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
		alp.add(new Person(154, 24, "Ashish", "ashish@gmail.com", new IDProof("Pan Card", "LifeTime")));
		alp.add(new Person(145, 22, "Mangesh", "mangesh@gmail.com", new IDProof("Pan Card", "LifeTime")));
		alp.add(new Person(149, 20, "Ajay", "ajay@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
		alp.add(new Person(198, 22, "Akash", "akash@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
		alp.add(new Person(191, 21, "Surj", "suraj@gmail.com", new IDProof("Pan Card", "LifeTime")));
		alp.add(new Person(161, 29, "Aman", "aman@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
		alp.add(new Person(159, 27, "Sunil", "sunil@gmail.com", new IDProof("Pan Card", "LifeTime")));
		alp.add(new Person(176, 31, "Sikandar", "sikandar@gmail.com", new IDProof("Aadhar Card", "LifeTime")));
	}

	public void idNameWithPersonCount(ArrayList<Person> alp, HashMap<String, Integer> hmap) {

		for (Person ps : alp) {
			String name = ps.idProof.idName;
			if (hmap.containsKey(name)) {
				int it = hmap.get(name);
				hmap.put(name, it + 1);
			} else {
				hmap.put(name, 1);
			}

		}
	}

	public static void main(String[] args) {
		ArrayList<Person> alp = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();
		PersonIDProofMain pm = new PersonIDProofMain();
		pm.setPersonDetails(alp);
		System.out.println(alp);
		pm.idNameWithPersonCount(alp, hmap);
		System.out.println(hmap);

	}

}
