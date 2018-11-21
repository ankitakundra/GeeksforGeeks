import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			String s = sc.next();
			String str[]  = s.split("\\.");
			for( int i =0;i<str.length-1;i++)
			{
				StringBuilder sb = new StringBuilder(str[i]);
				System.out.print(sb.reverse()+".");
			}
			StringBuilder sb = new StringBuilder(str[str.length-1]);
			System.out.print(sb.reverse());
			System.out.println();
		}
		
	}

}
