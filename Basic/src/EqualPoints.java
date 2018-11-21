import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EqualPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int Arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				Arr[i] = sc.nextInt();
			}
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			for (int i = 0; i < n; i++) {
				set.add(Arr[i]);
			}
			if (set.size() % 2 == 0)
				System.out.println(-1);
			else {
				ArrayList<Integer> al = new ArrayList<Integer>(set);
				int a = al.get(set.size() / 2);
				for (int i = 0; i < n; i++) {
					if (Arr[i] == a)
					{
						System.out.println(i);
						break;
					}
				}
			}
t--;
		}
	}

}