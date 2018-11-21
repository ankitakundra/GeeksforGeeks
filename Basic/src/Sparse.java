import java.util.Scanner;

public class Sparse {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
				int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			String num = Integer.toBinaryString(n);
			int i=0;
			for(  i=0;i<num.length()-1;i++)
			{
				if((num.charAt(i) =='1') && (num.charAt(i) == num.charAt(i+1)))
				{
				System.out.println(0);
					break;
				}
				
			}
			if(i==num.length()-1)
				System.out.println(1);
			
		}

	}

}
