import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t--!=0)
			{
				String s  = sc.next();
				if(s.charAt(0)==s.charAt(1))
					System.out.println("DRAW");
				else if((s.charAt(0)=='P') &&(s.charAt(1)=='S'))
					System.out.println("B");
				else if((s.charAt(0)=='S') &&(s.charAt(1)=='P'))
					System.out.println("A");
				else if((s.charAt(0)=='R') &&(s.charAt(1)=='S'))
					System.out.println("A");
				else if((s.charAt(0)=='S') &&(s.charAt(1)=='R'))
					System.out.println("B");
				else if((s.charAt(0)=='P') &&(s.charAt(1)=='R'))
					System.out.println("A");
				else if((s.charAt(0)=='R') &&(s.charAt(1)=='P'))
					System.out.println("B");
			}

	}

}
