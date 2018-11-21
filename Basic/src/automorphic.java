import java.util.Scanner;

public class automorphic {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t--!=0)
			{
				int n = sc.nextInt();
				int sq = n*n;
				int n1 = n;
				int count=0;
				while(n>0)
				{
					count++;
					n=n/10;
				}
				int d= sq%((int)Math.pow(10, count));
				if(d==n1)
					System.out.println("Automorphic");
				else
					System.out.println("Not Automorphic");
			}
			

	}

}
