import java.util.Scanner;

public class factors {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int count=0;
			int n = sc.nextInt();
			for( int i=1;i<=n/2;i++)
			{
				if(n%i==0)
					count++;
			}
			System.out.println(count+1);
		}

	}

}
