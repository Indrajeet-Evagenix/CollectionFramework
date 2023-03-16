package Practice;

// TEST Class
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();

		StudentOperation sop = new StudentOperation();

		sop.setElemnts(stud);
		sop.percentage(stud);
		sop.percentage1(stud);// By Using Iterator Method
	}

}
