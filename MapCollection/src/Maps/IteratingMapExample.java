package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();// Random Output

		hm.put(12, "Indrajeet");
		hm.put(121, "Akaksh");
		hm.put(54, "Ashish");
		hm.put(41, "Sushil");
		hm.put(36, "Mangesh");
		hm.put(62, "Ajit");

		System.out.println(hm);

		System.out.println("\n-----Traversing Only The Key-----");
		for (Integer it : hm.keySet()) {
			System.out.print(it + " ");
		}

		System.out.println("\n\n-----Traversing Only The Values-----");
		for (String st : hm.values()) {
			System.out.print(st + " ");
		}

		System.out.println("\n\n-----Traversing Whole Map-----");
		for (Map.Entry<Integer, String> map : hm.entrySet()) {
			System.out.print(map.getKey() + " " + map.getValue() + ", ");
//			System.out.println(map + " ");
		}

		System.out.println("\n\n-----Traversing Using Iterator-----");
		Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		// Using Set Method
		System.out.println("\n\n-----Traversing Using Set And Iterator-----");
//		Set s=hm.entrySet();// Using Generic Set Method 
		Set<Map.Entry<Integer, String>> s = hm.entrySet();// Using Non Generic Set Method 
//		Iterator it=hm.entrySet().iterator();// By Using Generic 'Iterator'
		Iterator<Map.Entry<Integer, String>> itr1 = s.iterator();// By Using Non Generic 'Iterator'
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}

	}

}
