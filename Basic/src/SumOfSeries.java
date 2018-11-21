import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int sum=0;
			int n = sc.nextInt();
			sum = n*(n+1)/2;
			System.out.println(sum);
		}
	}

}
