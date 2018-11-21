import java.util.Scanner;

public class MaxSumInSubarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for( int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int result=0;
			for( int i =0;i<n-1;i++)
			{
				int t1 = arr[i];
				int t2 = arr[i+1];					
				int sum = t1+t2;
				if(result<sum)
					result = sum;
				
			}
			System.out.println(result);
		}

	}

}
