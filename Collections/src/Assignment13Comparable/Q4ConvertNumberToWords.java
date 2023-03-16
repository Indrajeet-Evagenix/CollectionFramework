package Assignment13Comparable;

import java.util.ArrayList;
import java.util.HashMap;

public class Q4ConvertNumberToWords {

	public void setElements(ArrayList<Integer> link, HashMap<String, Integer> hm) {

		for (Integer it : link) {
			String name = "";
			switch (it) {
			case 1:
				name = "one";
				break;
			case 2:
				name = "two";
				break;
			case 3:
				name = "three";
				break;
			case 4:
				name = "four";
				break;
			}
			if (hm.containsKey(name)) {
				int x = hm.get(name);
				hm.put(name, x + 1);
			} else {
				hm.put(name, 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> link = new ArrayList<>();

		link.add(1);
		link.add(4);
		link.add(2);
		link.add(1);
		link.add(3);
		link.add(1);
		link.add(4);

		System.out.println(link);

		HashMap<String, Integer> hm = new HashMap<>();
		Q4ConvertNumberToWords cnt = new Q4ConvertNumberToWords();
		cnt.setElements(link, hm);

		System.out.println(hm);

	}

}
