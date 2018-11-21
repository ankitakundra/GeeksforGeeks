import java.util.Scanner;

public class ZeroCoverage {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0 )
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int x = 0;x <n;x++)
			{
				for(int y = 0;y <m;y++)
				{
					arr[x][y] = sc.nextInt();
				}
			}
			coverage(arr,n,m);
			t--;
		}
		sc.close();
	}
	public static void coverage(int arr[][],int n ,int m)
	{
		int count=0;
	for(int x = 0;x <n;x++)	
	{
		for(int y = 0;y <m;y++)
		{
			if(arr[x][y]==0 && x >0)
			{
				count+=arr[x-1][y];
			}
			if(arr[x][y]==0 && y >0)
			{
				count+=arr[x][y-1];
			}
			if(arr[x][y]==0 && x <n-1)
			{
				count+=arr[x+1][y];
			}
			if(arr[x][y]==0 && y <m-1)
			{
				count+=arr[x][y+1];
			}
		}
	}
	System.out.println(count);
	}

}
