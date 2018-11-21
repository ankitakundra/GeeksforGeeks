import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {

			int n = sc.nextInt();
			ArrayList<Long> al = new ArrayList<Long>();
			Long a = 1L, b = 1L;
			al.add(a);
			al.add(b);
			for (int i = 3; i <= n; i++) {
				long c = (a + b)%1000000007;
				al.add(c);
				a = b;
				b = c;
			}
			System.out.println(al.get(n-1));
		}

	}

}
