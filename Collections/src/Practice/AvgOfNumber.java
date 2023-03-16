package Practice;

import java.util.ArrayList;

public class AvgOfNumber {

	public static void main(String[] args) {
		ArrayList<Float> al = new ArrayList<>();

		al.add((float) 55.2);
		al.add((float) 11.5);
		al.add((float) 20.6);
		al.add((float) 35.4);
		al.add((float) 41.5);
		al.add((float) 52.5);
		al.add((float) 61.1);
		al.add((float) 45.3);
		al.add((float) 70.1);

		System.out.println(al);
		float sum = 0;
		for (Float itr : al) {
			sum = sum + itr;
		}
		System.out.println(sum);
		float avg = (sum / al.size());

		System.out.println(avg);

	}

}
