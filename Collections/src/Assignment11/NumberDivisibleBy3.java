package Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberDivisibleBy3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i=0;i<9;i++) {
			num.add(sc.nextInt());
		}

//		num.add(1);
//		num.add(2);
//		num.add(3);
//		num.add(4);
//		num.add(5);
//		num.add(6);
//		num.add(7);
//		num.add(8);
//		num.add(9);

		for (Integer it : num) {
			if (it % 3 == 0) {
				System.out.print(it + " ");
			}
		}

	}

}
