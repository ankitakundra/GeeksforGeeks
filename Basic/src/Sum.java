import java.util.Scanner;

public class Sum{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		int sum=0;
		while(t--!=0)
		{
			int n = sc.nextInt();
			for( int x = 1;x <=n;x++)
			{
				int y = (int)java.lang.Math.floor(n/x);
				sum = sum+(x*y);		
			}
			System.out.println(sum);
		}	
	}
}