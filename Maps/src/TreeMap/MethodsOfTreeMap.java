package TreeMap;

import java.util.TreeMap;

public class MethodsOfTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(3, "Indrajeet");
		tm.put(45, "Akash");
		tm.put(25, "Mukesh");
		tm.put(98, "Mangesh");
		tm.put(67, "Pankaj");

		System.out.println(tm);

		System.out.println("First Key: " + tm.firstKey());

		System.out.println("Last Key: " + tm.lastKey());

		System.out.println("First Entry: " + tm.firstEntry());

		System.out.println("Last Entry: " + tm.lastEntry());

		System.out.println("Floor Key: " + tm.floorKey(40));// Greatest key less then or equal to 40

		System.out.println("Flo0r Entry: " + tm.floorEntry(40));// Greatest Entry less then or equal to 40

		System.out.println("Ceiling Key: " + tm.ceilingKey(40));// Smallest key Greater then or equal to 40

		System.out.println("Ceiling Entry: " + tm.ceilingEntry(40));// Smallest Entry Greater then or equal to 40

		System.out.println(tm.tailMap(40));

		System.out.println(tm.tailMap(40, false));

		System.out.println(tm.subMap(5, 60));

		System.out.println(tm.subMap(5, false, 50, true));
	}

}
