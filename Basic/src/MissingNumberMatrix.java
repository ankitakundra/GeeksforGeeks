import java.util.Scanner;

public class MissingNumberMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			
			int row=0;
			int col=0;
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			for(int i =0;i<n;i++)
			{
				for( int j=0;j<n;j++)
				{
					arr[i][j] = sc.nextInt();
				}
				
			}
			for(int i =0;i<n;i++)
			{
				for( int j=0;j<n;j++)
				{
					if(arr[i][j] ==0)
						row = i;
						col=j;
				}
			}
			for(int i =0;i<n;i++)
			{
			
				

	}

}