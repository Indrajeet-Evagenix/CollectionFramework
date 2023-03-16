package ComparableAndComparator;

public class Car implements Comparable<Car> {

	int carId, carPrice;
	String carName, carBrand, launchYear;

	public Car(int carId, int carPrice, String carName, String carBrand, String launchYear) {
		super();
		this.carId = carId;
		this.carPrice = carPrice;
		this.carName = carName;
		this.carBrand = carBrand;
		this.launchYear = launchYear;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carPrice=" + carPrice + ", carName=" + carName + ", carBrand=" + carBrand
				+ ", launchYear=" + launchYear + "]";
	}

	public int compareTo(Car cr) {
//		return this.carBrand.compareTo(cr.carBrand);
		
		if (this.carBrand.compareTo(cr.carBrand) == 0) {
			if (this.carPrice > cr.carPrice) {
				return 1;
			} else if (this.carPrice < cr.carPrice) {
				return -1;
			} else {
				this.carName.compareTo(cr.carName);
			}
		}
		return this.carBrand.compareTo(cr.carBrand);
	}

}
