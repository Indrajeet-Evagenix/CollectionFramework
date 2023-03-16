package Maps;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// Sorted Order by Key
		// It Gives Output in Sorted Order By Key
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
