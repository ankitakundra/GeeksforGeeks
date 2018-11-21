import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LoveForTwins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (hm.get(arr[i]) != null) {
					int s = hm.get(arr[i]);
					hm.put(arr[i], ++s);
				} else
					hm.put(arr[i], 1);
			}
			int count = 0;
			for (Entry<Integer, Integer> entry : hm.entrySet()) {
				if (entry.getValue() >= 2) {
					if (entry.getValue() % 2 == 0)
						count = count + entry.getValue();
					else
						count = count + entry.getValue() - 1;
				}

			}
			System.out.println(count);

		}

	}

}
