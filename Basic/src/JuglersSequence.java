import java.util.Scanner;

public class JuglersSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int a= sc.nextInt();
			System.out.print(a+" ");
			while(a!=1)
			{
				int b=0;
				if(a%2==0)
					b = (int)Math.sqrt(a);
				else
					b = (int)Math.floor(Math.sqrt(a)*a);
				if(b==1)
				System.out.print(b);
				else
					System.out.print(b+" ");
				a=b;
			}
			System.out.println();
		}

	}

}
