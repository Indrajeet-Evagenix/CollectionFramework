package MapsByUsingConstructor;

public class OrderStatus {
	
	String deliveryDate, orderStatus;

	public OrderStatus(String deliveryDate, String orderStatus) {
		this.deliveryDate = deliveryDate;
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderStatus [deliveryDate=" + deliveryDate + ", orderStatus=" + orderStatus + "]";
	}

}
