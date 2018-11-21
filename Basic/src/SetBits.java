import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int sum=0;
			int n = sc.nextInt();
			String s =Integer.toBinaryString(n);
			for( int i =0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if(c=='1')
				sum++;
			}
			System.out.println(sum);
		}

	}

}
