import java.util.Scanner;
public class Pattern {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t >0)
		{
			int n  = sc.nextInt();
			printPattern(n);
			t--;
			System.out.println();
		}
		sc.close();
	}
	public static void printPattern(int n)
	{
		int p=n;
		int arr[] = new int[n*2-1];
		
		int r = 0;
			for(int y =(p*2-1)-1;y>=(p*2-1)/2;y--)
			{
				for	(int z = y;z>=r;z--)
				{
					arr[z] = n;
				}
				for(int t = 0;t<arr.length;t++)
					System.out.print(arr[t]);
				n--;
				r=r+1;
				System.out.print(" ");
				if(r==p)
				{
					r--;
					n++;
					break;
				}
			}
			for(int y =(p*2-1)/2+1;y<(p*2-1);y++)
			{
				r = r-1;
				n++;
				for	(int z = y;z>=r;z--)
				{
					arr[z] = n;
				}
				for(int t = 0;t<arr.length;t++)
					System.out.print(arr[t]);
				
				if(r==0)
					break;
				System.out.print(" ");
			}	
	}
}

