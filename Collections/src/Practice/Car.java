package Practice;

public class Car {

	int carId, carPrice;
	String carName, launchYear, brandName;

	public Car(int carId, int carPrice, String carName, String launchYear, String brandName) {
		
		this.carId = carId;
		this.carPrice = carPrice;
		this.carName = carName;
		this.launchYear = launchYear;
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carPrice=" + carPrice + ", carName=" + carName + ", launchYear=" + launchYear
				+ ", brandName=" + brandName + "]";
	}

}
