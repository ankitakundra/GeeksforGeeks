import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class KingsWar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		while(t--!=0)
		{
		    ArrayList<Integer> arr= new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int i = 0;i< n;i++)
			{
			arr.add(sc.nextInt());	
			}
		int a = Collections.max(arr);
		int b = Collections.min(arr);
		if(n<=2)
		  System.out.println(0);
		else if(a==b)
		    System.out.println(n-1);
		else{ 
		    int count = 0;
		for (Iterator<Integer> iter = arr.listIterator(); iter.hasNext(); ) {
		    	int o = iter.next();
		    	if((o==a) ||(o==b))
		           ++count;
		    } 
		    //	System.out.println(count);  
		  	System.out.println(n-count);  
		}
	
}
	}
}