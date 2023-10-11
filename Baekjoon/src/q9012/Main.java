package q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			String inp = sc.next();
			int cnt = 0;

			for (char c : inp.toCharArray()) {
				if (c == '(') {
					cnt++;
				} else {
					cnt--;
				}

				if (cnt < 0) {
					break;
				}
			}
			if (cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
