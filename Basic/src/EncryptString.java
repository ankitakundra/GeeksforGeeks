import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EncryptString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			String str = sc.next();
			String s ="";
			int count=1;
			for(int i =0;i<str.length();i++)  //0
			{
				char c = str.charAt(i);//tttyyttrree
				if(i+1==str.length())
				{
					s=s+str.charAt(i)+(count);
					break;
				}
						if(str.charAt(i+1)==c)
						{
							count = count+1;
						}
						else
						{
						s = s+str.charAt(i)+count;
						count=1;
						continue;
						}
			}
			System.out.println(new StringBuilder(s).reverse());
		}
	}
}
	
						