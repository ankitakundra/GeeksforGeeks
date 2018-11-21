import java.util.Scanner;

public class KthDigit {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int t  = sc.nextInt();
		while(t--!=0)
		{
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b==0)
			System.out.println(0);
		else if(a==0)
			System.out.println(0);
		else
		{
		int k = sc.nextInt();
		long num =(long) Math.pow(a, b);
		String s = Long.toString(num);
		char c = s.charAt(s.length()-k);
		System.out.println(Integer.parseInt(Character.toString(c)));
		}
		}
	}

}
