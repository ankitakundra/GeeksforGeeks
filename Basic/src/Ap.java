import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int a = sc.nextInt();
			int d = sc.nextInt()-a;
			int n =sc.nextInt();
			int num = a+(n-1)*d;
			System.out.println(num);
		}

	}

}
