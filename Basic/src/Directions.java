import java.util.Scanner;

public class Directions {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while( t >0 )
			{
				int n = sc.nextInt();
				int arr[] = new int[n];
				for(int i = 0;i<n;i++)
				{
					arr[i] = sc.nextInt();
				}
				String dir = sc.next();
				directions(arr,dir);
				t--;
			}
			sc.close();
		}
		
		public static void directions(int arr[],String dir)
		{
			int ew = 0,ns =0;
			double sum=0;
			for(int i = 0;i <dir.length();i++)
			{
				if(dir.charAt(i) == 'E')
					ew = ew+arr[i];
				if(dir.charAt(i) == 'W')
					ew = ew-arr[i];
				if(dir.charAt(i) == 'N')
					ns = ns+arr[i];
				if(dir.charAt(i) == 'S')
					ns = ns-arr[i];
				
			}
			for(int i = 0;i <arr.length;i++)
			{
				sum  = sum+arr[i];
			}
			sum = (sum+(Math.sqrt(ew*ew+ns*ns)));
			System.out.println((int)Math.ceil(sum));
			 
		}

}
