import java.util.Arrays;
import java.util.Scanner;

public class Multiply {
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t > 0)
		{
			int n  = sc.nextInt();
			int A[] = new int[n];
			int B[] = new int[n];
			for(int x = 0;x < n;x++)
			{
				A[x]= sc.nextInt();
			}
			for(int x = 0;x < n;x++)
			{
				B[x]= sc.nextInt();
			}
			multiplyArray(A,B);
			t--;
		}
	}
	public static void multiplyArray(int A[],int B[])
	{
		int sum = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int x =0;x<A.length;x++)
		{
			sum = sum + A[x]*B[B.length-x-1];
		}
		System.out.println(sum);
	}

}
