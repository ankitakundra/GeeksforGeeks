import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MegaSale {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}
			Collections.sort(al);
			int sum = 0;
			for (int i = 0; i < m; i++) {
				if (al.get(i) < 0)
					sum = sum + al.get(i);
			}
			if (sum > 0)
				System.out.println("0");
			else
				System.out.println(sum * -1);
		}
	}

}
