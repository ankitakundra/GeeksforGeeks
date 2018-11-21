import java.util.Scanner;

public class NumbersWithZero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int sum=0;
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				int num = i;
				sum= sum+count(num);
			}
			System.out.println(sum);
		}

	}

	public static int count(int num) {
		int count=0;
		while (num > 0) {
			if (num % 10 == 0) {
				count++;
				break;
			} else
				num = num / 10;
		}
		return count;
	}

}
