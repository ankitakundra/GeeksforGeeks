import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			BigInteger n = sc.nextBigInteger();
			BigInteger val = fibo(n);
			if (val.toString().length() == 1) {
				System.out.println("0" + val.toString());
			} else
				System.out.println(val);
		}

	}

	public static BigInteger fibo(BigInteger n) {

		Map<BigInteger, BigInteger> memo = new HashMap<BigInteger, BigInteger>();
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ZERO;
		else if (n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		if (memo.containsKey(n))
			return memo.get(n);
		BigInteger b = fibo(n.subtract(BigInteger.valueOf(2))).add(fibo(n.subtract(BigInteger.valueOf(1))));
		return b;
	}

}