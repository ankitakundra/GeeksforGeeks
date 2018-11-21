import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sharing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 1; i <= k; i++) {
				al.add(n % i);
			}
			if(al.size()>0)
			System.out.println(Collections.max(al));
			else
				System.out.println(n);
		}

	}

}
