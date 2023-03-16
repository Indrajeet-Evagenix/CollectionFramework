package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;

public class FacultyMain {

	public void setElements(ArrayList<Faculty> fac) {

		fac.add(new Faculty(154, "Indrajeet", 65000, "Maths", "Computer"));
		fac.add(new Faculty(136, "Samarjeet", 65000, "Biology", "Computer"));
		fac.add(new Faculty(144, "Akshay", 55000, "Maths", "Computer"));
		fac.add(new Faculty(121, "Akash", 55000, "Chemistry", "IT"));
		fac.add(new Faculty(128, "Pankaj", 71000, "Maths", "IT"));
		fac.add(new Faculty(102, "Mukesh", 55000, "Chemistry", "IT"));
		fac.add(new Faculty(115, "Alok", 50000, "Physics", "EXTC"));
		fac.add(new Faculty(122, "Sushil", 56000, "Chemistry", "EXTC"));
		fac.add(new Faculty(103, "Mangesh", 50000, "Physics", "EXTC"));
	}

	public void sort(ArrayList<Faculty> fac) {
		Collections.sort(fac, new FacultySortDeptComparator());
	}

	public static void main(String[] args) {
		ArrayList<Faculty> fac = new ArrayList<>();

		FacultyMain fm = new FacultyMain();
		fm.setElements(fac);
		System.out.println(fac);

		fm.sort(fac);
		System.out.println(fac);

	}

}
