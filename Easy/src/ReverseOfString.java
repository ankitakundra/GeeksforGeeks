import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			String str  = sc.next();
			String s[] = str.split("\\.");
			for( int i =s.length-1;i>0;i--)
			{
				System.out.print(s[i]+".");
			}
			System.out.println(s[0]);
		}

	}

}
