package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();// Random Output

		hm.put(12, "Indrajeet");
		hm.put(121, "Akaksh");
		hm.put(54, "Ashish");
		hm.put(41, "Sushil");
		hm.put(36, "Mangesh");
		hm.put(62, "Ajit");

		System.out.println(hm + "\n");

		// Insertion Order is same as Output
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(12, "Indrajeet");
		lhm.put(121, "Akaksh");
		lhm.put(54, "Ashish");
		lhm.put(41, "Sushil");
		lhm.put(36, "Mangesh");
		lhm.put(62, "Ajit");

		System.out.println(lhm + "\n");

		// Sorted Order by Key
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(12, "Indrajeet");
		tm.put(121, "Akaksh");
		tm.put(54, "Ashish");
		tm.put(41, "Sushil");
		tm.put(36, "Mangesh");
		tm.put(62, "Ajit");

		System.out.println(tm);
	}

}
