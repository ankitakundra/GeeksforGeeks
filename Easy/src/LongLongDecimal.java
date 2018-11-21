import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class LongLongDecimal {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			if(n==0)
				System.out.println((int)355/113);
			else
			{
			MathContext mc = new MathContext(n+1);
			BigDecimal d = BigDecimal.valueOf(355.0).divide(BigDecimal.valueOf(113.0),mc);
			System.out.println(d);
			}
		}

	}

}
