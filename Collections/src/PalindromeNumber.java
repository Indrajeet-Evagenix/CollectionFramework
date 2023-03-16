import java.util.ArrayList;

public class PalindromeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(2);
		al.add(1);

		System.out.println(al);
		int num = 0,temp,rem;
		for(Integer it:al) {
			rem=it%10;
			num=(num*10)+it;
			num=num/10;
		}

	}

}
