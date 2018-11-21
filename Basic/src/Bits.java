import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			String bits = Integer.toBinaryString(n);
			if(bits.charAt(k-1)=='1')
			{	
				StringBuilder sb = new StringBuilder(bits);
				sb.setCharAt(k-1, '0');
				String bits1 = sb.toString();
				int value = Integer.parseInt(bits1, 2);
				System.out.println(value);
				
			}
			else
				System.out.println(n);
		}

	}

}
