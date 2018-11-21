import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n= sc.nextInt();
			int k= sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
		}
			int i=0;
			for( i =0;i<n;i++)
			{
				if(arr[i]==k)	
				{
					System.out.println(i+1);
				break;
				}
			}
			if(i==n)
				System.out.println(-1);
		}
	}

}
