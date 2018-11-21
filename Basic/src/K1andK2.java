import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K1andK2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}
			int k1 = sc.nextInt();
			int k2 = sc.nextInt();
			Collections.sort(al);
			int sum = 0;
			for (int i = k1; i < k2 - 1; i++) {
				sum = sum + al.get(i);
			}
			System.out.println(sum);
		}

	}

}
