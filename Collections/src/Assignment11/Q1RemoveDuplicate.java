package Assignment11;

import java.util.ArrayList;

public class Q1RemoveDuplicate {

	// Remove Duplicates From ArrayList By Using Normal for Loop But it can't remove
	// all Occurrences
	public void duplicte(ArrayList<String> al) {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					al.remove(j);
				}
			}
		}
		System.out.println(al);
	}

	// Use This Only! It Remove all Occurrences From The List
	public void secondMethodDuplicate(ArrayList<String> al) {
		ArrayList<String> al1 = new ArrayList<>();
		for (String st : al) {
			if (!al1.contains(st)) {
				al1.add(st);
			}
		}
		System.out.println(al1);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Mon");

		Q1RemoveDuplicate q1 = new Q1RemoveDuplicate();
		q1.duplicte(al);
		q1.secondMethodDuplicate(al);

	}

}
