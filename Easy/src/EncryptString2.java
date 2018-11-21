import java.util.Scanner;

public class EncryptString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
		String s = sc.next();
		int k=1;
		String str="";
		for (int i = 0; i < s.length()-1; i++) {
			char c = s.charAt(i);
			char d = s.charAt(i+1);
			//System.out.println(c+" "+d);
			if(c!=d)
			{
				String s1 = Integer.toHexString(k);
				str = str+c+s1;
				if(i==s.length()-2)
				{
					s1 = Integer.toHexString(1);
					str = str+d+s1;
				}
				k=1;
			}
			else
			{
				k++;
				if(i==s.length()-2)
				{
					String s1 = Integer.toHexString(k);
					str = str+d+s1;
				}
				
			}
		}
		System.out.println(new StringBuilder(str).reverse());
		}

	}

}
