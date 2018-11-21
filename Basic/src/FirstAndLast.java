import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i < n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int f = sc.nextInt();
			FindFirstandLast(arr,f);
			t--;
		}
	}

	public static void FindFirstandLast(int[] arr, int f) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i < arr.length;i++)
		{
			if(arr[i]==f)
			{
				al.add(i);
			}	
		}
		if(al.size()>0)
		{
			System.out.println(al.get(0) +" "+al.get(al.size()-1));
			
		}
		else if(al.size()==1)
			System.out.println(al.get(0) +" "+al.get(0));
		else
			System.out.println(-1);	
		
	}

}
