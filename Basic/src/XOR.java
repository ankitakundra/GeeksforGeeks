import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t >0 )
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			Xoring(arr,x);
			t--;
		}
		sc.close();
	}
	
	public static void Xoring(int arr[],int x)
	{
		int count=0;
		for( int i = 0;i< arr.length-1;i++)
		{
			for( int j = i+1;j<arr.length;j++)
			{
				
			if((arr[i] ^ arr[j])==x)
			{
				count++;
			}
		}
		}
		System.out.println(count);
	}

}
