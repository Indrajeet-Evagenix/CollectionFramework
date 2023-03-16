package Assignment15;

import java.util.HashSet;
import java.util.Iterator;

public class Q3HashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Indrajeet");
		hs.add("Akash");
		hs.add("Amarjeet");
		hs.add("Ashish");
		hs.add("Sushil");
		hs.add("Sunil");
		hs.add("Avijeet");
		hs.add("Anand");
		hs.add("Akhilesh");
		hs.add("Raju");

		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String st = itr.next();
			if (st.contains("e")) {
				itr.remove();
			}
		}
		System.out.println(hs);

	}

}
