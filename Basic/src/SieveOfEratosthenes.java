import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			boolean arr[] = new boolean[n+1];
			for( int i =0;i<=n;i++)
			{
				arr[i] = true;
			}
		
			for( int p=2;p*p<=n;p++)
			{
			if(arr[p]==true)
			{
				for(int j =p*2;j<=n;j+=p)
					arr[j] = false;		
			}
			}
			for(int j = 2; j <= n; j++)
	        {
	            if(arr[j]== true)
	                System.out.print(j + " ");
	        }
			System.out.println();
		}

	}

}
