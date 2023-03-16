import java.util.ArrayList;
import java.util.Scanner;

public class CalculateTwoDigitNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

//		al.add(11);
//		al.add(2);
//		al.add(43);
//		al.add(94);
//		al.add(5);
//
//		System.out.println(al);

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter Number");
		for (int i = 0; i < 5; i++) {
			count = sc.nextInt();
			al.add(count);
		}

		System.out.println(al);
		int countNew = 0;
		for (Integer it : al) {
			if (it > 9 && it < 100) {
				countNew++;
			}
		}
		System.out.println(countNew);

	}

}
