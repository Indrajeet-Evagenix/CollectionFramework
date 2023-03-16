package CloneMethod;

public class Department12 implements Cloneable {

	String departmentName;

	public Department12(String departmentName) {

		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "DepartmentName=" + departmentName;
	}

	public Object clone() throws CloneNotSupportedException {
		Department12 d = (Department12) super.clone();
		return d;
	}

}
