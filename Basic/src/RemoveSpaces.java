import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = sc.nextInt();
		while (t-- != 0) {
			while(sc.hasNextLine())
			{
				String s= sc.nextLine();
				String s1 = "";
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if (c != ' ')
						s1 = s1 + c;
				}
				System.out.print(s1);
			}
		}

	}
}
