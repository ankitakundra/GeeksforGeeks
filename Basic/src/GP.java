import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			ArrayList<Double> al = new ArrayList<Double>();
			int a = sc.nextInt();
			Double a1 = (double)a;
			int b = sc.nextInt();
			double r = (double)b/a;
			System.out.println(r);
			int n = sc.nextInt();
			al.add(a1);
			for( int  i=1;i< n;i++)
			{
			al.add(a1*=r);
			}
			System.out.println((int)Math.floor(al.get(al.size()-1)));
		}

	}

}
