import java.util.ArrayList;
import java.util.Scanner;

public class rotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int d = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for( int i =0;i<n;i++)
			{
				al.add(sc.nextInt());
			}
			for( int i =0;i<d;i++)
			{
				al.add(al.get(i));
			}
			for( int i =d;i<al.size();i++)
			{
				System.out.print(al.get(i)+" ");
			}
			System.out.println();
		}
	}

}
