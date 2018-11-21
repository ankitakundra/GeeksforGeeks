import java.util.Scanner;
import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s = sc.next();
			String final_result = "";
			Stack<String> stack = new Stack<String>();
			for (int i = 0; i < s.length(); i++) {
				String str = "";
				// System.out.println(stack);
				String str12 = "";
				String str123 = "";
				char c = s.charAt(i);
				if ((c >= '1') && (c <= '9')) {
					char d = s.charAt(i + 1);
					if ((d >= '0') && (d <= '9')) {
						str = str + c + d;
						stack.push(str);
						i++;
					} else {
						str = str + c;
						stack.push(str);
					}
				} else if (c == '[') {
					str = str + c;
					stack.push(str);
				} else if ((c >= 'a') && (c <= 'z')) {
					char d = s.charAt(i + 1);
					if ((d >= 'a') && (d <= 'z')) {
						i++;
						str = str + c + d;
						stack.push(str);
					} else {
						str = str + c;
						stack.push(str);
					}
				}

				else if (c == ']') {
					String temp = "";
					while (stack.peek().charAt(0) != '[') {
						temp = stack.pop() + temp;
						// System.out.println(temp);
					}
					stack.pop();
					if (stack.peek().charAt(0) == '[') {
						stack.push(temp);
					} else if ((stack.peek().charAt(0) >= 'a') && (stack.peek().charAt(0) <= 'z')) {
						String temp1 = stack.pop();
						stack.push(temp1 + temp);
					} else {
						String num = stack.pop();
						// System.out.println(num);
						for (int z = 0; z < Integer.parseInt(num); z++) {
							str123 = temp + str123;
						}
						stack.push(str123);
					}
				}
			}
			System.out.println(stack.pop());
		}
	}
}