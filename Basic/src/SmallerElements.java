import java.util.Scanner;

public class SmallerElements {
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t > 0)
		{
			int n  = sc.nextInt();
			int A[] = new int[n];
			for(int x = 0;x < n;x++)
			{
				A[x]= sc.nextInt();
			}
			smaller(A);
			t--;
		}
		sc.close();
	}
	
	public static void smaller(int A[])
	{
		int count=0;
		for(int x = 1;x<A.length;x++)
		{
			
			int y = x-1;
			while(y>=0)
			{
				if(A[x]>A[y])
				{
					y--;
					continue;
				}
				break;
			}
			if(y==-1)
				count++;
		}
		System.out.println(count+1);
	}
	

}
