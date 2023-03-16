import java.util.ArrayList;

public class CheckDigitArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(11);
		al.add(2);
		al.add(43);
		al.add(94);
		al.add(5);

		int cnt = 0;
		for (Integer it : al) {
			if (it > 9 && it < 100) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
