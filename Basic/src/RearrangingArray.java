import java.util.ArrayList;
import java.util.Scanner;

public class RearrangingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			if (n % 2 == 0) {
				for (int i = n - 1; i >= n / 2; i--) {
					al.add(arr[i]);
					al.add(arr[n - 1 - i]);

				}
			} else {
				for (int i = n - 1; i > n / 2; i--) {
					al.add(arr[i]);
					al.add(arr[n - 1 - i]);

				}
				al.add(arr[n / 2]);
			}
			for(int i=0;i<al.size();i++)
			{
				System.out.print(al.get(i)+" ");
			}
			System.out.println();
		}

	}

}
