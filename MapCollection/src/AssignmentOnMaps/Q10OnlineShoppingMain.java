package AssignmentOnMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Q10OnlineShoppingMain {

	public void setItemDetails(ArrayList<Q10OnlineShopping> al) {

		al.add(new Q10OnlineShopping(112, "ParleG", 20, 10));
		al.add(new Q10OnlineShopping(113, "GoodDay", 40, 30));
		al.add(new Q10OnlineShopping(112, "ParleG", 20, 5));
		al.add(new Q10OnlineShopping(113, "GoodDay", 40, 10));

	}

	public void findQuentity(ArrayList<Q10OnlineShopping> al, HashMap<String, Integer> hmap) {
		for (Q10OnlineShopping osp : al) {
			String item = osp.name;
			if (hmap.containsKey(item)) {
				int it = hmap.get(item);
				hmap.put(item, it + osp.quentity);
			} else {
				hmap.put(item, osp.quentity);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Q10OnlineShopping> al = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();

		Q10OnlineShoppingMain om = new Q10OnlineShoppingMain();
		om.setItemDetails(al);
		System.out.println(al);

		System.out.println();
		om.findQuentity(al, hmap);
		System.out.println(hmap);

	}

}
