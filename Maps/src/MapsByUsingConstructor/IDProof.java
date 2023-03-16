package MapsByUsingConstructor;

public class IDProof {

	String idName, idValidity;

	public IDProof(String idName, String idValidity) {
		this.idName = idName;
		this.idValidity = idValidity;
	}

	@Override
	public String toString() {
		return "IDProof [IdName=" + idName + ", IdValidity=" + idValidity + "]";
	}

}
