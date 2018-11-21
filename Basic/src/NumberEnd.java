import java.util.Scanner;

public class NumberEnd {
	public static void main(String args[])
	{
Scanner sc = new Scanner(System.in);
boolean ch = false;
int n = sc.nextInt();
while(n >0)
{
	String str = sc.next();
	ch = findlength(str);
	if(ch == true)
		System.out.println("1");
	else
		System.out.println("0");
	n--;
}


sc.close();
}
	public static boolean findlength(String str)
	{
		char c = str.charAt(str.length()-1);
		char c1 = str.charAt(str.length()-2);
		if((c1>=97)&&(c1<=122))
				{
			int l = Character.getNumericValue(c);
			if(l == (str.length()-1))
				return true;
				}
		else
		{
		char c2 = str.charAt(str.length()-3);
		if((c2>=97)&&(c2<=122))
		{
			String s = ""+c1+c;
			int l = Integer.parseInt(s);
			if(l == (str.length()-2))
				return true;
		}
		else
		{
			String s = ""+c2+c1+c;
			int l = Integer.parseInt(s);
			if(l == (str.length()-3))
				return true;
		}
		}
		return false;
	}
	
	
}
