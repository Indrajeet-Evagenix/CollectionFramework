import java.util.Scanner;

public class CheckDigitContains {

	public boolean check(int num) {

		boolean present = false;
		while (num > 0) {
			if (num % 10 == 3) {
				present = true;

			}
			num = num / 10;
		}
		return present;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isPresent = false;
		System.out.println("Enter Digit");
		int num = sc.nextInt();
		CheckDigitContains cd = new CheckDigitContains();
		if (cd.check(num) == true) {
			isPresent = true;
		}
		System.out.println(isPresent);

	}

}
