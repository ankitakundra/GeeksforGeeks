
import java.util.Scanner;

public class GFG {

	static boolean IsPerfectSquare(long N){
		
		int p = (int)Math.sqrt(N);
		if(p*p==N)
			return true;
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int flag =  0;
		while(t--!=0) {
		flag =  0;
	
			
		int N = sc.nextInt();
		if(N==1)
			flag = 1;
		for(long i=0;i<=N/2;++i){
			if(IsPerfectSquare(N - i*i)){
				flag  = 1;
				break;
			}
		}
		

		System.out.println(flag);
		
		}
	}

}