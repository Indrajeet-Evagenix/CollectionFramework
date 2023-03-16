package HashSetExample;

public class Item implements Comparable<Item> {

	int itemId;
	String itemName;
	int itemPrice, itemQuentity;

	public Item(int itemId, String itemName, int itemPrice, int itemQuentity) {

		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuentity = itemQuentity;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQuentity="
				+ itemQuentity + "]";
	}

	@Override
	public int compareTo(Item o) {
		if (this.itemId > o.itemId) {
			return 1;
		} else if (this.itemId < o.itemId) {
			return -1;
		} else {
			return 0;
		}
	}

}
