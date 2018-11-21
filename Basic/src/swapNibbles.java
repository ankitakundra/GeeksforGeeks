import java.util.Scanner;

public class swapNibbles {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			String num = Integer.toString(n, 2);
			int l = 8-num.length();
			for(int i =0;i<l;i++)
			{
				num = "0"+num;
			}
			String str1 = num.substring(0, 4);
			String str2 = num.substring(4, num.length());
			System.out.println(Integer.parseInt(str2+str1, 2));
			
			
		}

	}

}
