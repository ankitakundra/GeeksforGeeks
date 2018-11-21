import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class maxProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}
			Collections.sort(al);
			System.out.println(al.get(al.size() - 2) * al.get(al.size() - 1));
		}

	}

}
