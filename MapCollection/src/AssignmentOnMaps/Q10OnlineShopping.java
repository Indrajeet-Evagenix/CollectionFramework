package AssignmentOnMaps;

// 10.	Customer does online shopping to leverage Diwali offers. Shopping list of 
// Customers is maintained in following format: ArrayList<Item> Each Item has 
// ID,name,price and qty. From ArrayList of Items create a map <String,Integer> 
// where Item Name is key and total quantity ordered for that Item as Value. 
// Eg. Items in shpping list are:
// [(112,”ParleG”, 20.00, 10),(113,”GoodDay”,40.00,30),
// (112,”ParleG”, 20.00, 5),(113,”GoodDay”,40.00,10)]
// Then Map would be like this :{{ParleG, 15},{GoodDay,40}}

public class Q10OnlineShopping {

	int id, price, quentity;
	String name;

	public Q10OnlineShopping(int id, String name, int price, int quentity) {
		this.id = id;
		this.price = price;
		this.quentity = quentity;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Q10OnlineShopping [id=" + id + ", price=" + price + ", quentity=" + quentity + ", name=" + name + "]";
	}

}
