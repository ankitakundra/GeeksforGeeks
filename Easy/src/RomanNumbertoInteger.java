import java.util.Scanner;

public class RomanNumbertoInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s = sc.next();
			int i = 0;
			int final_number=0;
			while (i < s.length()) {
				char c = s.charAt(i);
				int num = toLetters(c);
				//System.out.println(num);
				if(i==s.length()-1)
				{
					final_number = final_number+num;
					break;
				}
				else
				{
					int next_number = toLetters(s.charAt(i+1));
					//System.out.println(num);
					if(next_number>num)
					{
						i++;
						final_number = final_number+(next_number-num);
						//System.out.println(final_number);
						i++;
					}
					else
					{
					final_number = final_number+num;	
					i++;
					}
					
				}
			}
			System.out.println(final_number);
		}

	}

	public static int toLetters(char c) {
		switch(c)
		{
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return -1;
		}

	}
	

}
