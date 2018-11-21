import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc   = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for( int i =0;i<n-1;i++)
			{
				arr[i] = sc.nextInt();
			}
			int sum=0;
			for( int i = 0;i<n;i++)
			{
				sum= sum+arr[i];
			}
			int sum1 = n*(n+1)/2;
			System.out.println(sum1-sum);
		}

	}

}
