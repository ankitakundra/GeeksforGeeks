import java.util.Scanner;

public class CsAndSs {
	
	public static void main(String args[])
	{
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			while(n >0)
			{
			int C = sc.nextInt();
			int S = sc.nextInt();
			int count=0;
			int i =0;
			for(i=C ; i >0;i-=2)
			{
				if((S!=0) && (C >1))
				{
				count++;
				S--;
				C-=2;
				}
				else
					break;
			}
			System.out.println(count);
			int t = i/4;
			count=count+t;
			System.out.println(count);
			n--;
			}
				}
			}
}
