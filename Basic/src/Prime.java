import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t--!=0)
		{
			int count=0;
			int n = sc.nextInt();
			for( int i = 2;i<n;i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
