package AssignmentOnMaps;

public class Q7City {

	int cityId;
	String cityName;

	public Q7City(int cityId, String cityName) {

		this.cityId = cityId;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Q7City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}

	public int hashCode() {
		return cityId;
	}

	public boolean equals(Object o) {
		Q7City ct = (Q7City) o;
		if (this.cityId == ct.cityId) {
			return true;
		} else {
			return false;
		}
	}

}
