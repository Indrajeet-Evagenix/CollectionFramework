package MapsByUsingConstructor;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderStatusMain {

	public void setOrderDetails(ArrayList<Order> alo) {
		alo.add(new Order(12, 1400, "Mumbai", new OrderStatus("12-02-2023", "Pending")));
		alo.add(new Order(121, 1600, "Lucknow", new OrderStatus("12-01-2023", "Delivered")));
		alo.add(new Order(132, 1500, "Pune", new OrderStatus("16-01-2023", "Delivered")));
		alo.add(new Order(98, 1300, "Delhi", new OrderStatus("02-02-2023", "Pending")));
		alo.add(new Order(67, 1800, "Mumbai", new OrderStatus("14-01-2023", "Delivered")));
		alo.add(new Order(54, 1900, "Pune", new OrderStatus("29-01-2023", "Pending")));

	}

	public void findDeliveryStatus(ArrayList<Order> alo, HashMap<String, Integer> hmap) {
		for (Order od : alo) {
			String status = od.oStatus.orderStatus;
			if (hmap.containsKey(status)) {
				int it = hmap.get(status);
				hmap.put(status, it + 1);
			} else {
				hmap.put(status, 1);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Order> alo = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();

		OrderStatusMain om = new OrderStatusMain();
		om.setOrderDetails(alo);
		om.findDeliveryStatus(alo, hmap);
		System.out.println(hmap);

	}

}
