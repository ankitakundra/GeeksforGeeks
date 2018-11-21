import java.util.Scanner;

public class StartingPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int p = sc.nextInt();
			int arr[] = new int[2*p];
			for( int i = 0;i <2*p;i++)
			{
				arr[i] = sc.nextInt();
			}
			for( int i =0; i <arr.length;i++)
			{
				if(i%2 ==0)
				{
					x = x-arr[i];
				}
				else
					y = y-arr[i];
					 
			}
			System.out.println(x + " "+y);
		}
	}

}
