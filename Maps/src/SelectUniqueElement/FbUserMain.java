package SelectUniqueElement;

import java.util.HashMap;

public class FbUserMain {

	public void setFbUser(HashMap<FbUser, Integer> hmap) {

		hmap.put(new FbUser(101, "Indrajeet", "indrajeet@gmail.com", "Male", "INdrajeet@123", "8412965783"), 24);
		hmap.put(new FbUser(113, "Akash", "akash@gmail.com", "Male", "akash@123", "1234567890"), 22);
		hmap.put(new FbUser(108, "Ankita", "ankita@gmail.com", "Female", "ankita@123", "9874563210"), 23);
		hmap.put(new FbUser(121, "Sunil", "sunil@gmail.com", "Male", "sunil@123", "9632587410"), 20);

	}

	public static void main(String[] args) {
		HashMap<FbUser, Integer> hmap = new HashMap<>();

		FbUserMain fm = new FbUserMain();
		fm.setFbUser(hmap);

		System.out.println(hmap);

		hmap.put(new FbUser(121, "Sunil", "sunil@gmail.com", "Male", "sunil@123", "9632587410"), 29);

		System.out.println(hmap);
	}

}
