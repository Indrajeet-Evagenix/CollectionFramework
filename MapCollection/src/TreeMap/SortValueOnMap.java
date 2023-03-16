package TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortValueOnMap {

	public void setStudentDetails(TreeMap<Integer, Student12> tmap) {

		tmap.put(2, new Student12("Indrajeet", "indrajeet@gmail.com", 78));
		tmap.put(98, new Student12("Akaksh", "akash@gmail.com", 87));
		tmap.put(35, new Student12("Sushil", "sushil@gmail.com", 68));
		tmap.put(27, new Student12("Mukesh", "mukesh@gmail.com", 92));
		tmap.put(85, new Student12("Pankaj", "pankaj@gmail.com", 71));

	}

	public void sortOnValue(TreeMap<Integer, Student12> tmap) {

		System.out.println(tmap);
		System.out.println();

		System.out.println("----Creating ArrayList Student12----");
		ArrayList<Student12> al = new ArrayList<>();

		for (Student12 st : tmap.values()) {
			al.add(st);
		}
		System.out.println(al + "\n");

		Collections.sort(al, new SortStudentvalueComparator());
		System.out.println("-----Sorted ArrayList Of 'Student12'------");
		System.out.println(al);

		System.out.println("\n----Creating LinkedHashMap----");
		LinkedHashMap<Integer, Student12> lmap = new LinkedHashMap<>();

		for (Student12 st : al) {
			int key = 0;
			for (Map.Entry<Integer, Student12> ent : tmap.entrySet()) {
				if (st.studentName.equalsIgnoreCase(ent.getValue().studentName)) {
					key = ent.getKey();
					if (!lmap.containsKey(key)) {
						lmap.put(key, st);
					}
				}
			}
		}
		System.out.println(lmap);

	}

	public static void main(String[] args) {
		TreeMap<Integer, Student12> tmap = new TreeMap<>();

		SortValueOnMap svm = new SortValueOnMap();
		svm.setStudentDetails(tmap);
		svm.sortOnValue(tmap);

	}

}
