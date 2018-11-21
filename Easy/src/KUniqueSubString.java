import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class KUniqueSubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s = sc.next();
			int k = sc.nextInt();
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			for (int i = 0; i < s.length() - 1; i++) {
				for (int j = 1; j <= s.length() - i; j++) {
					String sub = s.substring(i, i + j);
					// System.out.println(sub);
					List<Character> list = new ArrayList<Character>();
					Set<Character> unique = new HashSet<Character>();
					for (char c : sub.toCharArray()) {
						list.add(c);
						unique.add(c);
					}
					if (unique.size() == k) {
						hm.put(sub, sub.length());
					}

				}
			}
			if (hm.size() == 0) {
				System.out.print("-1");
			} else 
				System.out.print((Collections.max(hm.values())));
			System.out.println();
			}
			
		}
	}
