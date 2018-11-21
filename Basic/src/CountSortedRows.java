import java.util.Scanner;
public class CountSortedRows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int m= sc.nextInt();
			int n = sc.nextInt();
			int arr[][] = new int[m][n];
			for ( int i =0;i<m;i++)
			{
				for( int j=0;j<n;j++)
				{
				arr[i][j] = sc.nextInt();	
				}
			}
			int count=0;
			for ( int i =0;i<m;i++)
			{
				for( int j=0;j<n;j++)
				{
				if(arr[i][j]>arr[i][j+1]) 
					count++;
			}
		}
	}
	}
}


