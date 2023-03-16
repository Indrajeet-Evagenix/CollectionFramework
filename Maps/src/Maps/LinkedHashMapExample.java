package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		// It Gives Output as Insertion Order
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(12, "Indrajeet");
		lhm.put(121, "Akaksh");
		lhm.put(54, "Ashish");
		lhm.put(41, "Sushil");
		lhm.put(36, "Mangesh");
		lhm.put(62, "Ajit");

		System.out.println(lhm + "\n");

	}

}
