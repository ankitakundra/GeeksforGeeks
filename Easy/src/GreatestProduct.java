import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GreatestProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}

			int j = 0;
			int count = 0;
			for (j = 0; j < n - 1; j++) {
				int p = (al.get(j)) * (al.get(j + 1));
				int sq = search(p, al);
				if (sq > count) {
					count = sq;
				}
			}
			System.out.println(count);

		}

	}

	public static int search(int p, ArrayList<Integer> al1) {
		for (int i = al1.size() - 1; i >= 0; i--) {
			if (p == al1.get(i)) {
				return p;

			}
		}
		return -1;
	}
}
