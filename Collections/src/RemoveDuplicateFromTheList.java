import java.util.LinkedList;

public class RemoveDuplicateFromTheList {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(70);
		al.add(5);
		al.add(9);
		al.add(4);
		al.add(10);
		al.add(5);
		al.add(4);
		al.add(4);
		al.add(4);

		System.out.println(al);

		// Remove Duplicates From LinkedList By Using Advance for Loop
//		ArrayList<Integer> al2 = new ArrayList<>();// we can use ArrayList Also
		LinkedList<Integer> al1 = new LinkedList<>();
		for (Integer i : al) {
			if (!al1.contains(i)) {
				al1.add(i);
			}
		}
		System.out.println(al1);

		// Remove Duplicates From LinkedList By Using Normal for Loop But it can't remove all 
//		for (int i = 0; i < al.size(); i++) {
//			int cnt=0;
//			for (int j = i + 1; j < al.size(); j++) {
//				if (al.get(i) == al.get(j)) {
//					al.remove(j);
//				}
//			}
//		}
//		System.out.println(al);

	}

}
