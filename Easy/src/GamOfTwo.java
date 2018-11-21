import java.math.BigInteger;
import java.util.Scanner;

public class GamOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			BigInteger n = sc.nextBigInteger();
			int i = 0;
			BigInteger val = BigInteger.valueOf(2);
			while (i >= 0) {
				boolean va = powerOf2(n);
				if(va==true)
				{
					n.divide(val);
				} else {
					
				    String temp = n.toString(2);
				    n=new BigInteger("2").shiftLeft(temp.length() - 2);
				}
				if (n.compareTo(BigInteger.ONE)==1) {
					if (i % 2 == 0)
					{
						System.out.println("karan");
						break;
					}
					else
					{
						System.out.println("Arjun");
						break;
					}
					
				} else
					i++;

			}

		}

	}

public static boolean powerOf2(BigInteger n)
{
	BigInteger val = BigInteger.valueOf(2);
	while(n.compareTo(BigInteger.ONE) > 1){
		   if(n.mod(val) != BigInteger.ZERO){
		    return false;
		   }
		   n.divide(val);
		  }
		  return true;
		 }
	
}
