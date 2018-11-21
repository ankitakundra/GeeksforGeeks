import java.util.Scanner;

public class TotalSetBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int count=0;
			int n = sc.nextInt();
			for( int i = 1;i<=n;i++)
			{
				 count = count+Integer.bitCount(i);
			}
			System.out.println(count);
		}

	}

}
