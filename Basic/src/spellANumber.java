import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class spellANumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			BigInteger n = sc.nextBigInteger()	;
			int k=0;
			int arr[] = new int[10];
			String s = n.toString();
			for(int i =0;i<s.length();i++)
			{
			char c = s.charAt(i);
			Character c1 = new Character(c);
			int num =Character.getNumericValue(c1);
			arr[num]++;
					
			}
			int prod = 1;
			for(int i =0;i<arr.length;i++)
			{
				
				if(arr[i]!=0)
				{
					prod = prod*(int) Math.pow(2, arr[i]-1);
				}
			}
			System.out.println(prod);
		}

	}

}
