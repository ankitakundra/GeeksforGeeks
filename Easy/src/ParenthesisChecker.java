import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			String s = sc.next();
			boolean b = exp(s);
			if(b==true)
				System.out.println("balanced");
			else
				System.out.println("not balanced");

		}

	}

	public static boolean exp(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c == '(') || (c == '{') || (c == '['))
				stack.push(c);
			else if (c == ']') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '[')
					return false;

			} else if (c == ')') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '(')
					return false;

			} else if (c == '}') {
				if (stack.isEmpty())
					return false;
				if (stack.pop() != '{')
					return false;
			}
		}
		return stack.isEmpty();

	}
}
