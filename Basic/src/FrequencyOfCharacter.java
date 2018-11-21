import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			ArrayList<String> al = new ArrayList<String>();
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				if (hm.get(s.charAt(i)) != null)
					hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
				else
					hm.put(s.charAt(i), 1);
			}
			int maxValue = Collections.max(hm.values());
			for (Entry<Character, Integer> entry : hm.entrySet()) {
				if (entry.getValue() == maxValue) {
					al.add(entry.getKey().toString());
				}

			}
			System.out.println(Collections.min(al));

		}

	}
}
