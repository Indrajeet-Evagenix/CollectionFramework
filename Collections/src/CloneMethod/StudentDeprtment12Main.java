package CloneMethod;

public class StudentDeprtment12Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department12 dept = new Department12("Computer");

		Student12 s = new Student12(11, "Indrajeet", dept);
		Student12 s1 = (Student12) s.clone();

		System.out.println(s);
		System.out.println(s1);

		s.dept.departmentName = "Mechanical";

		System.out.println();
		System.out.println(s);
		System.out.println(s1);

	}

}
