import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			String s = sc.next();
			String s1 = "";
			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				s1 = c + s1;
			}
			if (s1.equals(s))
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}

}
