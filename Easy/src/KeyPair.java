import java.util.Scanner;

public class KeyPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for( int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int count=0;
			for( int i =0;i<n;i++)
			{
				for(int j = i+1;j<n;j++)
				{
					if(arr[i]+arr[j]==x)
						count++;
				}
			}
			if(count!=0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
