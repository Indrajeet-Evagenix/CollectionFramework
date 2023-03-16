package MapsByUsingConstructor;

public class Order {

	int orderId, totalCost;
	String city;

	OrderStatus oStatus;

	public Order(int orderId, int totalCost, String city, OrderStatus oStatus) {
		this.orderId = orderId;
		this.totalCost = totalCost;
		this.city = city;
		this.oStatus = oStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalCost=" + totalCost + ", city=" + city + ", oStatus=" + oStatus
				+ "]";
	}

}
