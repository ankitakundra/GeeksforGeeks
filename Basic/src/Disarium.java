import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int count = 0;
			int s = n;
			while (n > 0) {
				n = n / 10;
				count++;
			}
			int i = 0;
			int sum = 0;
			int num = s;
			while (s > 0) {
				int d = s % 10;
				sum = sum + (int) Math.pow(d, count - i);
				i++;
				s = s / 10;
			}

			if (num == sum)
				System.out.println(1);
			else
				System.out.println(0);

		}
	}

}
