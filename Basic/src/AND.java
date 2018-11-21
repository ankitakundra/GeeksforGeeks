import java.util.Scanner;

public class AND {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int c=0;
			int n = sc.nextInt();
			int arr[] = new int[n];
			for( int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			for( int i =0;i<n;i++)
			{
				if(arr[i]==1)
					c++;
			}
			if(c==n)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

}
