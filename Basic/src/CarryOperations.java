import java.math.BigInteger;
import java.util.Scanner;

public class CarryOperations {
	
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t > 0)
		{
			BigInteger n1 = sc.nextBigInteger();
			BigInteger n2 = sc.nextBigInteger();
			Adding(n1,n2);
			t--;
			System.out.println();
		}
		sc.close();
	}
	public static void Adding(BigInteger n1,BigInteger n2)
	{
		int count=0;
		int sum=0;
		String a = n1.toString();
		String b = n2.toString();
		if(a.length()==b.length())
		{
			for(int i =a.length()-1;i>=0;i--)
			{
				count = count+Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i));
				count = count/10;
				sum = sum+count;
			}
			System.out.println(sum);
		}
		int gap=0;
		if(a.length() > b.length())
		{
		gap = a.length()-b.length();
		for(int i =0;i<gap;i++)
		{
			b = 0+b;
		}
			for(int i =a.length()-1;i>=0;i--)
			{
				count = count+Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i));
				count = count/10;
				sum = sum+count;
			}
			System.out.println(sum);
		}
		if(a.length() < b.length())
		{
			gap = b.length()-a.length();
		for(int i =0;i<gap;i++)
		{
			a = 0+a;
		}
			for(int i =a.length()-1;i>=0;i--)
			{
				count = count+Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i));
				count = count/10;
				sum = sum+count;
			}
			System.out.println(sum);
		
		}
		
	}
}


