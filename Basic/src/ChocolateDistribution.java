import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t >0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int x = 0;x < n; x++)
			{
				arr[x] = sc.nextInt();
			}
			
			int k = sc.nextInt();
			System.out.println(distribution(arr,k));
			t--;
		}
			sc.close();
		
	}
	public static int distribution(int arr[],int k)
	{
		// 3 4 7 9 9 
		int small = 0;
		int temp = 1000;
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++)
		{
			if(j+k > arr.length)
				break;
			small = arr[j+k-1]-arr[j];
			if(temp > small)
				temp = small;
		}
		return temp;
			}
		
	}
