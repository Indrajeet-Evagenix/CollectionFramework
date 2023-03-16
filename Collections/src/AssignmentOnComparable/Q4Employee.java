package AssignmentOnComparable;

// 4. Now modify Employee class so that it implements Comparable interface’s compareTo 
// method.Sorting should be done based on id in which use < , > & == technique.
public class Q4Employee implements Comparable<Q4Employee> {

	int employeeId;
	String employeeName, employeeDesignation;
	int employeeAge;

	public Q4Employee(int employeeId, String employeeName, String employeeDesignation, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Q4Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeAge=" + employeeAge + "]";
	}

	@Override
	public int compareTo(Q4Employee o) {
		if (this.employeeId > o.employeeId) {
			return 1;
		} else if (this.employeeId < o.employeeId) {
			return -1;
		} else {
			return 0;
		}
	}

}
