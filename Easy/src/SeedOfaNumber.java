import java.util.Scanner;

public class SeedOfaNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int count=0;
			int n = sc.nextInt();
			int prod_final = 0, s = 0;
			for (int i = 2; i <= n / 2; i++) {
				s = findProduct(i);
				prod_final = i * s;
				if (prod_final == n)
				{
					count++;
					System.out.print(i + " ");
				}
			}
			if(count==0)
				System.out.print(-1);
			System.out.println();
		}

	}

	public static int findProduct(int n) {
		int prod = 1;
		int n1 = n;
		int prodarr[] = new int[10000];
		if (n < 10)
			return n;
		else if (prodarr[n] != 0)
			return prodarr[n];
		else {
			while (n > 0) {
				int d = n % 10;
				prod = prod * d;
				n = n / 10;
			}
			prodarr[n1] = prod;
			return prod;
		}
	}

}
