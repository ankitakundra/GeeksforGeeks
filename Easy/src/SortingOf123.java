import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingOf123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			{
				al.add(sc.nextInt());
			}
			Collections.sort(al);
			for( int i =0;i<n;i++)
			{
				System.out.print(al.get(i)+" ");
			}
			System.out.println();
		}

	}

}
