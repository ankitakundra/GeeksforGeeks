import java.util.Scanner;

public class SumOfConsecutives {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0){
			long n = sc.nextLong();
			if(n==1)
				System.out.println("YES");
			else if(n==0)
				System.out.println("NO");
			else
			{
			Long a = n & n*-1;
			if(a==n)
				System.out.println("YES");
			else
				System.out.println("NO");
			}
		}
	}

}
