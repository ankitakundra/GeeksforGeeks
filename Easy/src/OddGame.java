import java.util.ArrayList;
import java.util.Scanner;

public class OddGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 1; i <= n; i++) {
				arr[i - 1] = i;
			}
			int count = 0, flag = 0;
//			while (arr.length > 0) {
				if (count % 2 == 0) {
					for (int i = 0; i < arr.length; i += 2) {
						if (flag == n - 1)
							break;
						else {
							flag++;
							arr[i] = 0;
						}
					}
				} else
					for (int i = 1; i < arr.length; i += 2) {
						if (flag == n - 1)
							break;
						else {
							flag++;
							arr[i] = 0;
						}
					}
				count++;
				if (flag == n - 1)
					break;
//			}
			for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
			}
		}
	}
}
