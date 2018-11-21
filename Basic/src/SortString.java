import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s1="";
			int arr[] = new int[257];
			int n = sc.nextInt();
			String s= sc.next();
			for(int i = 0;i<s.length();i++)
			{
				arr[s.charAt(i)]++;
			}
			for( int i = 0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					for(int j = 1;j<=arr[i];j++)
					s1 = s1+(char)i;
				}
			}
			System.out.println(s1);

		}

	}

}
