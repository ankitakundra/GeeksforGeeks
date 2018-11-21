import java.util.Scanner;

public class LearnGeo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int count = 0;
			while (n > 2) {
				count = count + (n - 2) / 2;
				n = n - 2;
			}
			System.out.println(count);
		}

	}

}
