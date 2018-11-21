import java.util.Scanner;

public class Floating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t--!=0) {
			double n = sc.nextDouble();
			int pos = Double.toString(n).indexOf('.');
			int len = Double.toString(n).length() - (pos + 1);
			int dom = (int)Math.pow(10, len);
			int n1 = dom;
			String str[] = Double.toString(n).split("\\.");
			String str1 = "";
			for (int i = 0; i < str.length; i++) {
				str1 = str1 + str[i];
			}
			int num = Integer.parseInt(str1);
			while (num != dom) {
				if (num > dom)
					num = num - dom;
				else
					dom = dom - num;
			}
			System.out.println(n1 / num);

		}
	}

}
