package Assignment13Comparable;

// Q.3.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConvertArrayListIntoHashMap {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nashik");
		al.add("pune");

		System.out.println(al);
		HashMap<String, Integer> hm = new HashMap<>();

		for (String st : al) {
			if (hm.containsKey(st)) {
				int count = hm.get(st);
				count++;
				hm.put(st, count);
			} else {
				hm.put(st, 1);
			}
		}
		System.out.println(hm);

	}

}
