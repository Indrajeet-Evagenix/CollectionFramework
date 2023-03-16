import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);

//		Object arr[]=al.toArray();
//		System.out.println(Arrays.toString(arr));

		Integer arr1[] = new Integer[al.size()];
//		int arr1[]=new int[al.size()]; // Not Allowed
		al.toArray(arr1);

		int ar[] = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			ar[i] = al.get(i);
		}

		Integer array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<Integer> list = new ArrayList<>();

		int ary[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<Integer> all = new ArrayList<>();
		for (int i = 0; i < ary.length; i++) {
			all.add(ary[i]);
		}
		System.out.println(all);

		// By Advance For Loop
//		for (int i : ary) {
//			all.add(i);
//		}
//		
//		System.out.println(all);

	}

}
