import java.util.Scanner;

public class Station {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char c='\0';
		int n=0;
		
		while(t--!=0)
		{
			 n = sc.nextInt();
			c = sc.next().charAt(0);
			if((n==11)&&(c=='D') ||((n==11)&&(c=='U')))
				System.out.println(0);

		if(c=='D')
				{
			if(n >11)
				System.out.println(n-11);
			else if(n <11)
				System.out.println((n-0)+11);
				}
		else if(c=='U')
		{
			if(n < 11)
				System.out.println(11-n);
			else if(n >11)
				System.out.println((19-n)+8);
		}
		
	}
	}

}
