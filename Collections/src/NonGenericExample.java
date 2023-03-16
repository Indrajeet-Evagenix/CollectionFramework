import java.util.ArrayList;

public class NonGenericExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Indrajeet");
		al.add(54.5);
		al.add('f');
		al.add("Mumbai");
		al.add(20);
		
		// Using Normal For Loop
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}

		// Using Advance For Loop
		for (Object al1 : al) {
//			System.out.println(al1);
			
			String s = al1.getClass().getSimpleName();
			
//			if (s.equalsIgnoreCase("Integer")) {
//				System.out.println(al1);
//			}
			
			if (s.equalsIgnoreCase("String")) {
				System.out.println(al1);
			}
		}

	}

}
