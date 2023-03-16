package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListIntoMaps {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();

		al.add('b');
		al.add('d');
		al.add('c');
		al.add('a');
		al.add('e');
		al.add('d');
		al.add('j');
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('a');
		al.add('j');
		al.add('d');
		al.add('a');
		al.add('b');

		System.out.println(al);

		HashMap<Character, Integer> hm = new HashMap<>();// Creating Empty HashMap

		// Using Advance For Loop
		for (Character ch : al) {
			if (hm.containsKey(ch)) {
				int count = hm.get(ch);
				count++;
				hm.put(ch, count);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

		// By Using Normal For Loop
//		for (int i = 0; i < al.size(); i++) {
////			char ch=al.get(i);// we can store in ch=al.get(i);
//			int cnt = 1;
//			for (int j = i + 1; j < al.size(); j++) {
//				if (al.get(i) == al.get(j)) {
//					cnt++;
//					al.set(j, '\0');
//
//				}
//			}
//			if (al.get(i) != '\0') {
//				System.out.println(al.get(i) + " " + cnt);
//			}
//		}
//		System.out.println(hm);
	}

}
