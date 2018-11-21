import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int min_len = n + 1;
			for (int start = 0; start < n; start++) {
				int curr_sum = arr[start];
				if (curr_sum > x)
					System.out.println("1");
				for (int end = start + 1; end < n; end++) {
					curr_sum += arr[end];
					if (curr_sum > x && (end - start + 1) < min_len)
						min_len = (end - start + 1);
				}
			}
			System.out.println(min_len);
		}

	}

}
