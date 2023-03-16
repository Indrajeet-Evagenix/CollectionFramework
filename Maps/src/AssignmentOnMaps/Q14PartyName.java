package AssignmentOnMaps;

import java.util.LinkedHashMap;

public class Q14PartyName {

	public void setElements(LinkedHashMap<String, String> lmap) {
		lmap.put("1278 1234 7874", "BJP");
		lmap.put("1278 1234 7896", "NCP");
		lmap.put("1245 1234 7895", "Congress");
		lmap.put("1278 1234 7897", "ShivSena");
		lmap.put("1278 1234 7884", "NCP");
		lmap.put("1278 1234 7882", "BJP");
		lmap.put("1278 1234 7885", "ShivSena");
		lmap.put("1278 1234 7876", "BJP");
		lmap.put("1278 1234 7832", "Congress");
	}

	public void countPartyName(LinkedHashMap<String, String> lmap, LinkedHashMap<String, Integer> newLmap) {

		for (String st : lmap.values()) {
			if (newLmap.containsKey(st)) {
				newLmap.put(st, newLmap.get(st) + 1);
			} else {
				newLmap.put(st, 1);
			}
		}
	}

	public static void main(String[] args) {
		LinkedHashMap<String, String> lmap = new LinkedHashMap<>();

		LinkedHashMap<String, Integer> newLmap = new LinkedHashMap<>();

		Q14PartyName pn = new Q14PartyName();
		pn.setElements(lmap);
		System.out.println(lmap);

		pn.countPartyName(lmap, newLmap);
		System.out.println(newLmap);
	}

}
