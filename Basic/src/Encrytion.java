import java.util.HashMap;
import java.util.Scanner;

public class Encrytion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t >0)
		{
			String a = sc.next();
			encrypt(a);
			t--;
	}
	}
		public static void encrypt(String a)
		{
			HashMap<Character,Integer> abc = new HashMap<Character,Integer>();
			for(int i =0;i <a.length();i++)
			{
				char c = a.charAt(i);
				if(abc.get(c)!=0)
				{
					abc.put(c, abc.get(c)+1);
				}
				else
					abc.put(c, 1);
			}
		}

}
