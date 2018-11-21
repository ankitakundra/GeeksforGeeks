import java.util.HashMap;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (hm.get(arr[i]) != null) {
					hm.put(arr[i], hm.get(arr[i]) + 1);
				} else
					hm.put(arr[i], 1);
			}
			for (int i = 1; i < n; i++) {
				if (hm.get(i) == null)
					System.out.print(0 + " ");
				else
					System.out.print(hm.get(i) + " ");
			}
			if (hm.get(n) == null)
				System.out.print(0);
			else
				System.out.print(hm.get(n));
			System.out.println();
		}

	}

}
