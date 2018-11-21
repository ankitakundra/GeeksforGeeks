import java.util.ArrayList;
import java.util.Scanner;

public class PandovanSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = 10^9+7;
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			ArrayList<Long> al = new ArrayList<Long>();
			al.add(1L);
			al.add(1l);
			al.add(1l);
			
			for(int i =3;i<=n;i++)
			{
				long p =(al.get(i-2) +al.get(i-3))%m;
				al.add(p);
			}
			//System.out.println(al.get(al.size()-1));
			System.out.println(al);
		}
		

	}

}
