import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int sum=0;
			int n = sc.nextInt();
			int n1 = n;
			while( n >0)
			{
				int d = n%10;
				sum = sum+(d*d*d);
				n=n/10;	
			}
			if(sum==n1)
				System.out.println("Yes");
			else
				System.out.println("No");
				
		}

	}

}
