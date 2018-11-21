import java.util.HashMap;
import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				int p = divisors(i);
				sum = sum + p;
			}
			System.out.println(sum);
		}
	}

	public static int divisors(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		if (hm.containsKey(n))
		{
			if( hm.get(n)==3)
				return 1;
			else
				return 0;
		}
		else {
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}
			hm.put(n, count);
			if (count == 3) {
				return 1;
			} else
				return 0;

		}
	}
}