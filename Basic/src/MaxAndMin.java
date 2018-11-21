import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			int n = sc.nextInt();
			int arr[] = new int[n];
			for( int i =0;i<n;i++)
			{
				 al.add(sc.nextInt());
			}
			if(n==1)
			System.out.println(al.get(0)+" "+al.get(0));
			else
			{
				System.out.print(Collections.max(al)+" ");
				System.out.print(Collections.min(al));
			}
			System.out.println();

	}

}
}
