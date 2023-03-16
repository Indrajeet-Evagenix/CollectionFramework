import java.util.ArrayList;

public class LengthOfString {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");

		for (String al1 : al) {
			System.out.println(al1 + "------>" + al1.length());
//			if (al1.contains("e")) {
//				System.out.println(al1);
//			}
		}
	}

}
