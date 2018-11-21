import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Abc {

	public static int lengthCalculate(String s)

	{
		// long a = Long.parseLong(s);
		int num[] = new int[127];
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {

			num[s.charAt(i)]++;
		}
		
		for (int i = 0; i < num.length; i++) {
			if ((num[i] > 1) && (num[i] != 0)) {
				counter=counter+num[i];
			}

		}
		if(counter%2==0)
			return counter;
		else
			return counter-1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(lengthCalculate("01810"));
	}
}
