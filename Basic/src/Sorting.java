import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int size = sc.nextInt();
			ArrayList <Integer> al = new ArrayList<Integer>();
			for(int i=0;i <size;i++)
			{
			al.add(sc.nextInt());
			}
			Collections.sort(al);
			for( int i=0;i <al.size()-2;i++)
			{
				
			System.out.print(al.get(i));
			if(i!=al.size()-3)
			System.out.print(" ");
			
		}
			System.out.println();

	}
	}
}

