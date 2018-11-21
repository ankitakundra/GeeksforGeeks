import java.util.Scanner;

public class Demonetisation {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			String str = sc.next();
			String m = sc.next();
			String n = sc.next();
			StringBuilder str3 = Remove(str,m,n);
			if(str3.equals(""))
				System.out.println("-1");
			else
				System.out.println(str3);
			t--;
		}
		sc.close();
	}
	public static StringBuilder Remove(String str,String m, String n)
	{
		StringBuilder strb = new StringBuilder(str);
		StringBuilder str1  = new StringBuilder();
		StringBuilder str2  = new StringBuilder();
		int l = strb.indexOf(m);
		System.out.println(l);
		while(l!=-1)
		{
			str1 = strb.delete(l, l+m.length());
			strb =str1;
			l = strb.indexOf(m);
		}
		if(l==-1)
			str1=strb;
		int l1 = str1.indexOf(n);
		while(l1!=-1)
		{
			str2 = str1.delete(l1, l1+n.length());
			str1 =str2;
			l1 = str1.indexOf(m);
		}
		if(l==-1)
			return str1;
		if((l==-1)&&(l1==-1))
			return new StringBuilder("");
		else
			return str2;
		
		
		}

}
