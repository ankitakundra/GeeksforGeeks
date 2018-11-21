import java.util.HashMap;
import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			String s[] = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
			}
			String str = sc.next();
			int h = 0;
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			for (int i = 0; i < n; i++) {
				if (str.contains(s[i])) {
					if (h < s[i].length()) {
						h = s[i].length();
						hm.put(s[i].length(), s[i]);
					}
				}

			}
			System.out.println(hm.get(h));
		}
	}

}
