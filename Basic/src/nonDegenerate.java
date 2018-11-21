import java.util.Scanner;

public class nonDegenerate {

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
			int count=0;
			for( int i =0;i<n-2;i++)
			{
				int k =i+2;
				for( int j=i+1;j<n;j++)
				{
					if(k<n && arr[i]+arr[j] >arr[k])
					{
						int s = (i+j+k)/3;
						int d = (s-i)*(s-j)*(s-k);
						if(d >0)
							count++;
					}
						
				}
			}
			System.out.println(count);
		}
	}

}
