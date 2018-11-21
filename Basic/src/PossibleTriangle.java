import java.util.Arrays;
import java.util.Scanner;

public class PossibleTriangle {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for( int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(countTriangle(arr,n));
		}
	}
	public static int countTriangle(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			int k =i+2;
			for(int j = i+1;j<n;j++)
			{
				while(k <n && arr[i]+arr[j] >arr[k])
					++k;
				count +=k-j-1;
			}
		}
		return count;
	}

}
