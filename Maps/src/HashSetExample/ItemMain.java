package HashSetExample;

import java.util.TreeSet;

public class ItemMain {

	public void setItemDetails(TreeSet<Item> hset) {

		hset.add(new Item(121, "Pepsi", 65, 2));
		hset.add(new Item(111, "Mango", 78, 5));
		hset.add(new Item(118, "Banana", 25, 11));
		hset.add(new Item(126, "Apple", 98, 12));
		hset.add(new Item(126, "Apple", 98, 12));

	}

	public static void main(String[] args) {
//		HashSet<Item> hset = new HashSet<>();
		TreeSet<Item> hset = new TreeSet<>();

		ItemMain im = new ItemMain();
		im.setItemDetails(hset);
		System.out.println(hset);

	}

}
