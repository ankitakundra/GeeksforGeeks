import java.util.ArrayList;
import java.util.Scanner;

public class GameOfXOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			ArrayList<Integer> list1 = new ArrayList<Integer>();

			int z = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					int curr_xor = 0;
					for (int k = i; k <= j; k++) {
						curr_xor = curr_xor ^ arr[k];
					}
					list1.add(curr_xor);
				}
			}
			int final_xor = 0;
			for (int i = 0; i < list1.size(); i++) {
				final_xor = final_xor ^ list1.get(i);
			}
			System.out.println(final_xor);

		}
	}
}