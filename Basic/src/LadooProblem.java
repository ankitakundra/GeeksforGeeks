import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LadooProblem {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i =0;i <n;i++)
			{
				al.add(sc.nextInt());
			}
			Set<Integer> set = new HashSet<Integer>(al);
			System.out.println(set.size());
		}

	}

}
