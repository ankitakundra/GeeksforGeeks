import java.util.Scanner;

public class InputOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int j = 0, c = 0;
			for (j = 0; j < n; j++) {
				if (arr[j] == 0) {
					c++;
				}
			}
			if (c == n)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}
