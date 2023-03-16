package AssignmentOnMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q11OrderMain {

	public void setOrderDetails(ArrayList<Q11Order> al) {

		al.add(new Q11Order(121, "Mumbai", "Parle", "Delivered"));
		al.add(new Q11Order(98, "Mumbai", "Froots", "Delivered"));
		al.add(new Q11Order(988, "Mumbai", "Clothes", "Pending"));
		al.add(new Q11Order(958, "Mumbai", "Clothess", "Pending"));

		al.add(new Q11Order(111, "Pune", "Britania", "Pending"));
		al.add(new Q11Order(1111, "Pune", "Britania Buiscuit", "Delivered"));

		al.add(new Q11Order(11, "Lucknow", "Shirts", "Delivered"));
		al.add(new Q11Order(10, "Lucknow", "Cotton-Shirts", "Pending"));

		al.add(new Q11Order(131, "Surat", "T-Shirts", "Pending"));
		al.add(new Q11Order(231, "Surat", "T-Shirts", "Pending"));
		al.add(new Q11Order(261, "Surat", "T-Shirts", "Pending"));
		al.add(new Q11Order(141, "Surat", "Charger", "Delivered"));
		al.add(new Q11Order(211, "Surat", "Type C-Charger", "Delivered"));
		al.add(new Q11Order(151, "Surat", "Adaptor", "Delivered"));

		al.add(new Q11Order(117, "Virar", "Water-Bottels", "Pending"));
		al.add(new Q11Order(112, "Virar", "Vivo-Mobile", "Delivered"));
		al.add(new Q11Order(122, "Virar", "Oppo-Mobile", "Delivered"));
		al.add(new Q11Order(169, "Virar", "Water-Bottels", "Pending"));
		al.add(new Q11Order(163, "Virar", "Vivo-Mobile", "Delivered"));

	}

	public void countCity(ArrayList<Q11Order> al, HashMap<String, Integer> hmap) {
		for (Q11Order osp : al) {
			String count = osp.city;
			if (osp.status.equals("Delivered")) {
				if (hmap.containsKey(count)) {
					int it = hmap.get(count);
					hmap.put(count, it + 1);
				} else {
					hmap.put(count, 1);
				}
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Q11Order> al = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();

		Q11OrderMain op = new Q11OrderMain();
		op.setOrderDetails(al);

		Collections.sort(al, new Q11Comparator());
		System.out.println(al);
//		System.out.println();

		op.countCity(al, hmap);
		System.out.println(hmap);

	}

}
