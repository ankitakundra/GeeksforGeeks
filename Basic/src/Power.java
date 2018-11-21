import java.util.Scanner;

public class Power {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t >0)
		{
			int n = sc.nextInt();
			System.out.println(FindPower(n));
			t--;
		}
		sc.close();
	}
	public static int FindPower(int a)
	{
		if(a==1)
			return 1;
			        int factor = 2;
		        while (factor <= Math.sqrt(a)) {
			            int number = a;
			            while (number % factor == 0) {
		                number = number/ factor;
			            }
			            if (number == 1) {
		                return 1;
			            } else {
			                factor++;
			            }
			        }
			        return 0;
			    }
}
