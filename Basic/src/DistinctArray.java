
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DistinctArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int x = 0; x < n; x++) {
					arr[x] = sc.nextInt();
			}
			distinct(arr);
			t--;
	}
		sc.close();
		}
		public static void distinct(int arr[])
		{
			Set<Integer>abc = new TreeSet<Integer>();
			for(int x = 0;x <arr.length;x++)
			{
				
				while(arr[x]>0)
				{
					int d = arr[x]%10;
					arr[x] = arr[x]/10;
					abc.add(d);
				}
			}
//			List<Integer> setList = new ArrayList<Integer>(abc); 
//			Collections.sort(setList);
//			for(int x = 0;x<setList.size()-1;x++)
//			{
//				System.out.print(setList.get(x)+" ");
//			}
//			System.out.print(setList.get(setList.size()-1));
			Iterator<Integer> it = abc.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next()+" ");
			}
				
		}
}
