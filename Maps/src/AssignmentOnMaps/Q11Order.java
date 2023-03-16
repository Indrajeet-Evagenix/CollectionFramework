package AssignmentOnMaps;

// 11. Flipkart maintains a list<order> from different places .Order has 
// (orderid,city,itemname,status). From this create a Map which stores key has 
// cityname and count as no of order’s delivered in that city. Data should be sorted 
// according to city.

public class Q11Order {

	int orderId;
	String city, itemName, status;

	public Q11Order(int orderId, String city, String itemName, String status) {

		this.orderId = orderId;
		this.city = city;
		this.itemName = itemName;
		this.status = status;
	}

	public String toString() {
		return "Q11Order [orderId=" + orderId + ", city=" + city + ", itemName=" + itemName + ", status=" + status
				+ "]";
	}

}
