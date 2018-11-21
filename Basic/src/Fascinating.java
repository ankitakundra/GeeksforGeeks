import java.util.Scanner;

public class Fascinating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int arr[] = new int[256];
			int n = sc.nextInt();
			String s = Integer.toString(n);
			if (s.length() < 3)
				System.out.println("Number should be atleast three digits");
			else {
				String str = s + Integer.toString(n * 2) + Integer.toString(n * 3);
				for(int i =0;i<str.length();i++)
				{
					arr[str.charAt(i)]++;
				}
				int count=0;
				for(int i =49;i<=57;i++)
				{
					if(arr[i]==1)
						count++;
				}
				if(count==9)
					System.out.println("Fascinating");
				else
					System.out.println("Not Fascinating");
			}

		}

	}

}
