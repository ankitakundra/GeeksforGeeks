import java.util.ArrayList;
import java.util.Scanner;

public class FlyingJet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Long> al = new ArrayList<Long>();
			long j=1;
			long z=0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					al.add(j*j*j*j);
					j++;
				} else
				{
				al.add((long)(7*Math.pow(3, z)));
				z++;
				}
				
			}
			System.out.println(al.get(n-1));
		}

	}

}
