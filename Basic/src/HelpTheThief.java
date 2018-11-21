import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HelpTheThief {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int steal = sc.nextInt();
			int gb = sc.nextInt();
			int arr[] = new int[2 * gb];
			for (int i = 0; i < 2 * gb; i++) {
				arr[i] = sc.nextInt();
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < 2 * gb; i += 2) {
				al.add(arr[i]);
			}
			Collections.sort(al);
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 1; i < 2 * gb; i += 2) {
				hm.put(arr[i], arr[i - 1]);
			}
			System.out.println(al);
			System.out.println(hm);
//			int gb1 = 0, count = 0, flag = 0;
//			for (int i = al.size() - 1; i >= 0; i--) {
//				gb1 = hm.get(al.get(i));
//				System.out.println(al.get(i) + " " + gb1);
//				for (int j = 0; j < gb1; j++) {
//					flag++;
//					if (flag > steal)
//						break;
//					else
//						count = count + al.get(i);
//
//				}
//
//			}
//			System.out.println(count);
		}
	}
}