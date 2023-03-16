package Assignment15;

/*14.Create a Map<String,String> where key is 
adharno and value is voted casted to
Which party (eg. BJP,ShivSena,NCP,Congress,Other).
From this create new map such That KEY is party
name and value is count of votes casted.*/

import java.util.LinkedHashMap;

public class Q2VoteCount {

	void addEle(LinkedHashMap<String, String> lh) {
		lh.put("1278 1234 7874", "BJP");
		lh.put("1278 1234 7896", "NCP");
		lh.put("1245 1234 7895", "Congress");
		lh.put("1278 1234 7897", "ShivSena");
		lh.put("1278 1234 7884", "NCP");
		lh.put("1278 1234 7882", "BJP");
		lh.put("1278 1234 7885", "ShivSena");
		lh.put("1278 1234 7876", "BJP");
		lh.put("1278 1234 7832", "Congress");

	}

	void voteCount(LinkedHashMap<String, String> lh, LinkedHashMap<String, Integer> vc) {

		for (String s : lh.values()) {
			if (vc.containsKey(s)) {
				vc.put(s, vc.get(s) + 1);
			} else
				vc.put(s, 1);
		}

	}

	public static void main(String[] args) {
		LinkedHashMap<String, String> lh = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> vc = new LinkedHashMap<>();
		Q2VoteCount v = new Q2VoteCount();
		v.addEle(lh);
		v.voteCount(lh, vc);
		System.out.println(vc);
	}

}
