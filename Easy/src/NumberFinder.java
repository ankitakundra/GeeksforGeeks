import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberFinder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			// String str = sc.next();
			find();
			t--;
		}
		sc.close();
	}

	public static void find() {
		ArrayList<Integer>abc = new ArrayList<Integer>();
		String str = "This is alpha 5057 and 97";
		String str1 = "";
		String arr[] = str.split(" ");
		int largest = 0, tmp = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			int x;
			str1 = arr[i];
			for (x = 0; x < str1.length(); x++) {
				if ((str1.charAt(x) >= 48) && (str1.charAt(x) <= 57)) {
					//System.out.println(str1);
					if (str1.charAt(x) == '9')
						break;
						else
						continue;
				}
				else
				{
					count++;
					break;
				}
			}
				if (x == str1.length()) {
					abc.add(Integer.parseInt(str1));	
				} 
				}
				if (count == 0)
					System.out.println(-1);
				else
				{
					Collections.sort(abc);
				System.out.println(abc.get(abc.size()-1));
				}
			}
}
