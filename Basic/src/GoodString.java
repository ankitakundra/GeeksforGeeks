import java.util.Scanner;

public class GoodString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s = sc.next();
			int count = 0;
			for (int i = 0; i < s.length() - 1; i++) {
				char c = s.charAt(i);
				char d = s.charAt(i + 1);
				if(((c=='z') && (d=='a')) || ((c=='a') && (d=='z')))
					count++;
				else if (new Character(c).compareTo(new Character(d)) > 0) {
					int a = d - c;
					if (a == -1) {
						
						a = a * -1;
						//System.out.println(a);
						if (a == 1)
							count++;
				} 
				}
				else {
					int a = d - c;
					//System.out.println(a);
					if (a == 1)
						count++;

				}

			}
			if (count == s.length() - 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
