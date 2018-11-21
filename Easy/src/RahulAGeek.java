import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RahulAGeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}
			int c=0,flag=0;
			int x = Collections.min(al);
			for (int i = 0; i < n; i++) {
				
				if(al.get(i)>x)
					c++;
				if(al.get(i)==x)
					flag++;
					
			}
			if(flag==0)
				System.out.println(c*x);
			else
				System.out.println(c*x+(x*(flag-1)));
		}

	}
}
