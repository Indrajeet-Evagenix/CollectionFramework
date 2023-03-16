package AssignmentOnMaps;

public class Q7Product {

	int productPrice;
	String productName, productMaterial;

	public Q7Product(int productPrice, String productName, String productMaterial) {

		this.productPrice = productPrice;
		this.productName = productName;
		this.productMaterial = productMaterial;
	}

	@Override
	public String toString() {
		return "Q7Product [productPrice=" + productPrice + ", productName=" + productName + ", productMaterial="
				+ productMaterial + "]";
	}

}
