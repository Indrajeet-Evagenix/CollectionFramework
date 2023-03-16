package AssignmentOnMaps;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDigit {

	public static boolean isTwoDigit(int num) {
		int cnt = 0;
		while (num != 0) {
			cnt++;
			num = num / 10;
		}
		if (cnt > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int elementCounter = 0;
		for (int i = 0; i < 5; i++) {
			int num;
			list.add(num = sc.nextInt());
		}
		for (int i = 0; i < list.size(); i++) {
			if (isTwoDigit(list.get(i)) == true) {
				elementCounter++;
			}
		}
		System.out.println(elementCounter);

	}

}
